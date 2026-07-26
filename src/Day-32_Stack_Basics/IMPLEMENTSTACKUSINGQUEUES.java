import java.util.LinkedList;
import java.util.Queue;

public class IMPLEMENTSTACKUSINGQUEUES {

    private Queue<Integer> q1;
    private Queue<Integer> q2;


    public IMPLEMENTSTACKUSINGQUEUES() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }


    public void push(int x) {
        
        q2.add(x);
        
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }


    public int pop() {
        if (q1.isEmpty()) return -1;
        return q1.remove();
    }


    public int top() {
        if (q1.isEmpty()) return -1;
        return q1.peek();
    }


    public boolean empty() {
        return q1.isEmpty();
    }


    public static void main(String[] args) {

        IMPLEMENTSTACKUSINGQUEUES stack = new IMPLEMENTSTACKUSINGQUEUES();
        
        stack.push(1);
        stack.push(2);
        
        System.out.println("Top element: " + stack.top());   // 2
        System.out.println("Popped element: " + stack.pop()); // 2
        System.out.println("Is empty? " + stack.empty());    // false
    }
}
