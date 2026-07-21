public class STACKUSINGLINKEDLIST {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Stack {

        Node top;
        int size;

        // Push
        void push(int value) {

            Node node = new Node(value);

            node.next = top;

            top = node;

            size++;
        }

        // Pop
        int pop() {

            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }

            int value = top.data;

            top = top.next;

            size--;

            return value;
        }

        // Peek
        int peek() {

            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return top.data;
        }

        // Empty
        boolean isEmpty() {
            return top == null;
        }

        // Size
        int size() {
            return size;
        }

        // Display
        void display() {

            if (isEmpty()) {

                System.out.println("Stack is Empty");

                return;
            }

            System.out.print("Stack : ");

            Node temp = top;

            while (temp != null) {

                System.out.print(temp.data + " ");

                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        stack.display();

        System.out.println("Top : " + stack.peek());

        System.out.println("Popped : " + stack.pop());

        stack.display();

        System.out.println("Size : " + stack.size());

        System.out.println("Is Empty : " + stack.isEmpty());
    }
}
