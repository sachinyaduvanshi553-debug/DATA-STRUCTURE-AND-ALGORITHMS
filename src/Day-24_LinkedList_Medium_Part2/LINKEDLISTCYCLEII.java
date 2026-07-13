public class LINKEDLISTCYCLEII {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                ListNode start = head;

                while (start != slow) {

                    start = start.next;
                    slow = slow.next;
                }

                return start;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        LINKEDLISTCYCLEII obj = new LINKEDLISTCYCLEII();

        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Creating cycle
        head.next.next.next.next = head.next;

        ListNode ans = obj.detectCycle(head);

        if (ans != null) {
            System.out.println("Cycle starts at node: " + ans.val);
        } else {
            System.out.println("No Cycle");
        }
    }
}