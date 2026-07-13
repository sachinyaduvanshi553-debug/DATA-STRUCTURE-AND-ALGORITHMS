public class BINARYLINKEDLISTTOINTEGER {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public int getDecimalValue(ListNode head) {

        int number = 0;

        while (head != null) {

            number = number * 2 + head.val;
            head = head.next;
        }

        return number;
    }

    public static void main(String[] args) {

        BINARYLINKEDLISTTOINTEGER obj = new BINARYLINKEDLISTTOINTEGER();

        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        System.out.println(obj.getDecimalValue(head));
    }
}