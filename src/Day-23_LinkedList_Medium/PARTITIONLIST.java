public class PARTITIONLIST {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode partition(ListNode head, int x) {

        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;

        ListNode afterHead = new ListNode(0);
        ListNode after = afterHead;

        while (head != null) {

            if (head.val < x) {

                before.next = head;
                before = before.next;

            } else {

                after.next = head;
                after = after.next;
            }

            head = head.next;
        }

        after.next = null;
        before.next = afterHead.next;

        return beforeHead.next;
    }

    public void print(ListNode head) {

        while (head != null) {

            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        PARTITIONLIST obj = new PARTITIONLIST();

        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        head = obj.partition(head, 3);

        obj.print(head);
    }
}