class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IMPLEMENTSTACKUSINGLINKEDLIST {

    private Node top;


    public IMPLEMENTSTACKUSINGLINKEDLIST() {
        this.top = null;
    }


    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return top.data;
    }


    public boolean isEmpty() {
        return top == null;
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        IMPLEMENTSTACKUSINGLINKEDLIST stack = new IMPLEMENTSTACKUSINGLINKEDLIST();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        stack.display();
    }
}
