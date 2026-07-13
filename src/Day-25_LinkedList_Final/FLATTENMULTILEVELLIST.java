public class FLATTENMULTILEVELLIST {

    static class Node {

        int val;
        Node prev;
        Node next;
        Node child;

        Node(int val) {
            this.val = val;
        }
    }

    public Node flatten(Node head) {

        if (head == null)
            return null;

        flattenDFS(head);

        return head;
    }

    private Node flattenDFS(Node head) {

        Node current = head;
        Node last = null;

        while (current != null) {

            Node next = current.next;

            if (current.child != null) {

                Node childHead = current.child;

                Node childTail = flattenDFS(childHead);

                current.next = childHead;
                childHead.prev = current;

                current.child = null;

                if (next != null) {

                    childTail.next = next;
                    next.prev = childTail;
                }

                last = childTail;

            } else {

                last = current;
            }

            current = next;
        }

        return last;
    }

    public void print(Node head) {

        while (head != null) {

            System.out.print(head.val + " ");

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        FLATTENMULTILEVELLIST obj = new FLATTENMULTILEVELLIST();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        n4.next = n5;
        n5.prev = n4;

        Node c1 = new Node(7);
        Node c2 = new Node(8);

        c1.next = c2;
        c2.prev = c1;

        n3.child = c1;

        Node head = obj.flatten(n1);

        obj.print(head);
    }
}