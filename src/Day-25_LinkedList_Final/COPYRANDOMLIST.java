import java.util.HashMap;

public class COPYRANDOMLIST {

    static class Node {

        int val;

        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }

    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node current = head;

        while (current != null) {

            map.put(current, new Node(current.val));

            current = current.next;
        }

        current = head;

        while (current != null) {

            map.get(current).next = map.get(current.next);

            map.get(current).random = map.get(current.random);

            current = current.next;
        }

        return map.get(head);
    }

    public void print(Node head) {

        while (head != null) {

            int randomValue =
                    (head.random == null) ? -1 : head.random.val;

            System.out.println(
                    "Node = " + head.val +
                            " Random = " + randomValue
            );

            head = head.next;
        }
    }

    public static void main(String[] args) {

        COPYRANDOMLIST obj = new COPYRANDOMLIST();

        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Node copied = obj.copyRandomList(n1);

        obj.print(copied);
    }
}