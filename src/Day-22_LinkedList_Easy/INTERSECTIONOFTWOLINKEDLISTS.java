public class INTERSECTIONOFTWOLINKEDLISTS {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {

            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {

        INTERSECTIONOFTWOLINKEDLISTS obj = new INTERSECTIONOFTWOLINKEDLISTS();

        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        ListNode ans = obj.getIntersectionNode(headA, headB);

        System.out.println(ans != null ? ans.val : "No Intersection");
    }
}