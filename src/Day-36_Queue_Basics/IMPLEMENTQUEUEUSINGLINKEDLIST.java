class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IMPLEMENTQUEUEUSINGLINKEDLIST {

    static class Queue {
        private Node front;
        private Node rear;

        public Queue() {
            this.front = null;
            this.rear = null;
        }

        // Process enqueue
        public void enqueue(int item) {
            Node newNode = new Node(item);

            if (this.rear == null) {
                this.front = this.rear = newNode;
                return;
            }

            this.rear.next = newNode;
            this.rear = newNode;
        }

        // Process dequeue
        public int dequeue() {
            if (this.front == null) {
                return -1;
            }

            Node temp = this.front;
            this.front = this.front.next;

            if (this.front == null) {
                this.rear = null;
            }

            return temp.data;
        }

        public int peek() {
            if (this.front == null) {
                return -1;
            }
            return this.front.data;
        }

        public boolean isEmpty() {
            return this.front == null;
        }

        // Process display
        public void display() {
            Node temp = this.front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display(); // 10 20 30

        System.out.println("Dequeued: " + q.dequeue()); // 10
        System.out.println("Peek: " + q.peek()); // 20
        
        q.display(); // 20 30
    }
}
