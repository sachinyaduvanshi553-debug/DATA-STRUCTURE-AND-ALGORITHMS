public class PALINDROMELINKEDLIST {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public boolean isPalindrome(ListNode head) {

        if (head == null ||
                head.next == null) {

            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null &&
                fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf =
                reverse(slow.next);

        ListNode firstHalf = head;

        while (secondHalf != null) {

            if (firstHalf.val != secondHalf.val) {

                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
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

        PALINDROMELINKEDLIST obj =
                new PALINDROMELINKEDLIST();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(
                obj.isPalindrome(head)
        );
    }
}