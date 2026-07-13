public class REVERSEKGROUP {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {

            ListNode kth = getKthNode(groupPrev, k);

            if (kth == null)
                break;

            ListNode groupNext = kth.next;

            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {

                ListNode temp = curr.next;

                curr.next = prev;

                prev = curr;

                curr = temp;
            }

            ListNode temp = groupPrev.next;

            groupPrev.next = kth;

            groupPrev = temp;
        }

        return dummy.next;
    }

    private ListNode getKthNode(ListNode current, int k) {

        while (current != null && k > 0) {

            current = current.next;
            k--;
        }

        return current;
    }

    public void print(ListNode head) {

        while (head != null) {

            System.out.print(head.val + " ");

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        REVERSEKGROUP obj = new REVERSEKGROUP();

        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = obj.reverseKGroup(head, 2);

        obj.print(head);
    }
}