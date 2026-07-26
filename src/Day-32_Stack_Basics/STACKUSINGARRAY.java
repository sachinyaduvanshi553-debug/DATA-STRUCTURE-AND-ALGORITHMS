public class STACKUSINGARRAY {

    static class Stack {

        private final int[] arr;
        private int top;

        Stack(int size) {
            arr = new int[size];
            top = -1;
        }

        // Push
        void push(int value) {

            if (top == arr.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }

            arr[++top] = value;
        }

        // Pop
        int pop() {

            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }

            return arr[top--];
        }

        // Peek
        int peek() {

            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return arr[top];
        }

        // Empty
        boolean isEmpty() {
            return top == -1;
        }

        // Size
        int size() {
            return top + 1;
        }

        // Display
        void display() {

            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }

            System.out.print("Stack : ");

            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        System.out.println("Top : " + stack.peek());

        System.out.println("Popped : " + stack.pop());

        stack.display();

        System.out.println("Size : " + stack.size());

        System.out.println("Is Empty : " + stack.isEmpty());
    }
}