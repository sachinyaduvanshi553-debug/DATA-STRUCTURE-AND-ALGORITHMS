class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DELETENNODESAFTERMNODES {

    static Node deleteNodes(Node head, int m, int n) {

        Node current = head;

        while (current != null) {

            for (int i = 1; i < m && current != null; i++)
                current = current.next;

            if (current == null)
                break;

            Node temp = current.next;

            for (int i = 0; i < n && temp != null; i++)
                temp = temp.next;

            current.next = temp;
            current = temp;
        }

        return head;
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
        Node temp = head;

        for (int i = 2; i <= 10; i++) {

            temp.next = new Node(i);
            temp = temp.next;
        }

        head = deleteNodes(head, 2, 2);

        print(head);
    }
}