public class MAXIMUMTWINSUM {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow);

        int max = 0;

        ListNode first = head;

        while (second != null) {

            max = Math.max(max, first.val + second.val);

            first = first.next;
            second = second.next;
        }

        return max;
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;

        while (head != null) {

            ListNode next = head.next;

            head.next = prev;

            prev = head;

            head = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        MAXIMUMTWINSUM obj = new MAXIMUMTWINSUM();

        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        int answer = obj.pairSum(head);

        System.out.println("Maximum Twin Sum = " + answer);
    }
}