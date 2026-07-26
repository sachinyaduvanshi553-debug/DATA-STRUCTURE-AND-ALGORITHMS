import java.util.Stack;

public class MINSTACK {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;


    public MINSTACK() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }


    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }


    public void pop() {
        if (stack.isEmpty()) return;
        
        int popped = stack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }


    public int top() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }


    public int getMin() {
        if (minStack.isEmpty()) return -1;
        return minStack.peek();
    }


    public static void main(String[] args) {

        MINSTACK minStack = new MINSTACK();
        
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        
        System.out.println("Min element: " + minStack.getMin()); // -3
        minStack.pop();
        System.out.println("Top element: " + minStack.top());    // 0
        System.out.println("Min element: " + minStack.getMin()); // -2
    }
}
