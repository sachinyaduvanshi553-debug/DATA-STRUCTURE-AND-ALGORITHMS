class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class PARTITIONLIST {

    static Node partition(Node head, int x) {

        Node beforeHead = new Node(0);
        Node afterHead = new Node(0);

        Node before = beforeHead;
        Node after = afterHead;

        while (head != null) {

            if (head.data < x) {

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

    static void print(Node head) {

        while (head != null) {

            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        head = partition(head, 3);

        print(head);
    }
}