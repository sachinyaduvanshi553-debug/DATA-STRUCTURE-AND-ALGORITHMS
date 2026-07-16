class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class INSERTSORTEDCIRCULARLIST {

    static Node insert(Node head, int value) {

        Node node = new Node(value);

        if (head == null) {

            node.next = node;
            return node;
        }

        Node curr = head;

        while (curr.next != head &&
                curr.next.data < value)
            curr = curr.next;

        node.next = curr.next;
        curr.next = node;

        return head;
    }

    public static void main(String[] args) {

        Node head = null;

        head = insert(head, 2);
        head = insert(head, 4);
        head = insert(head, 3);

        Node temp = head;

        do {

            System.out.print(temp.data + " ");
            temp = temp.next;

        } while (temp != head);
    }
}