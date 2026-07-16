class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SPLITLISTINTOKPARTS {

    static Node[] split(Node head, int k) {

        int length = 0;

        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        Node[] result = new Node[k];

        int size = length / k;
        int extra = length % k;

        temp = head;

        for (int i = 0; i < k; i++) {

            result[i] = temp;

            int currentSize = size + (extra-- > 0 ? 1 : 0);

            for (int j = 1; j < currentSize && temp != null; j++)
                temp = temp.next;

            if (temp != null) {

                Node next = temp.next;
                temp.next = null;
                temp = next;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node[] parts = split(head, 3);

        for (Node node : parts) {

            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }

            System.out.println();
        }
    }
}