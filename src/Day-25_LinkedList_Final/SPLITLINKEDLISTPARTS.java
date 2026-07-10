public class SPLITLINKEDLISTPARTS {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode[] splitListToParts(ListNode head, int k) {

        int length = 0;

        ListNode current = head;

        while (current != null) {

            length++;
            current = current.next;
        }

        int partSize = length / k;
        int extraNodes = length % k;

        ListNode[] result = new ListNode[k];

        current = head;

        for (int i = 0; i < k; i++) {

            if (current == null) {
                result[i] = null;
                continue;
            }

            result[i] = current;

            int currentPartSize = partSize;

            if (extraNodes > 0) {
                currentPartSize++;
                extraNodes--;
            }

            for (int j = 1; j < currentPartSize; j++) {
                current = current.next;
            }

            ListNode nextPart = current.next;
            current.next = null;
            current = nextPart;
        }

        return result;
    }

    public void print(ListNode head) {

        while (head != null) {

            System.out.print(head.val + " ");

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        SPLITLINKEDLISTPARTS obj = new SPLITLINKEDLISTPARTS();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        int k = 3;

        ListNode[] parts = obj.splitListToParts(head, k);

        System.out.println("Split Linked List into " + k + " parts:\n");

        for (int i = 0; i < parts.length; i++) {

            System.out.print("Part " + (i + 1) + ": ");

            obj.print(parts[i]);
        }
    }
}