public class MERGETWOSORTEDLISTS {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode mergeTwoLists(
            ListNode list1,
            ListNode list2) {

        ListNode dummy = new ListNode(-1);

        ListNode current = dummy;

        while (list1 != null &&
                list2 != null) {

            if (list1.val <= list2.val) {

                current.next = list1;
                list1 = list1.next;

            } else {

                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        current.next =
                (list1 != null)
                        ? list1
                        : list2;

        return dummy.next;
    }

    public void print(ListNode head) {

        while (head != null) {

            System.out.print(head.val + " ");

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        MERGETWOSORTEDLISTS obj =
                new MERGETWOSORTEDLISTS();

        ListNode a = new ListNode(1);
        a.next = new ListNode(3);
        a.next.next = new ListNode(5);

        ListNode b = new ListNode(2);
        b.next = new ListNode(4);
        b.next.next = new ListNode(6);

        ListNode result =
                obj.mergeTwoLists(a, b);

        obj.print(result);
    }
}