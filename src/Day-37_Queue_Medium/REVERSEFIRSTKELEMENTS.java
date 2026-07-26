import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class REVERSEFIRSTKELEMENTS {

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        
        if (q.isEmpty() || k > q.size() || k <= 0) {
            return q;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        // Push first k elements to stack
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }
        
        // Enqueue the elements back to queue from stack
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
        
        // Rotate the remaining elements
        int remaining = q.size() - k;
        for (int i = 0; i < remaining; i++) {
            q.offer(q.poll());
        }
        
        return q;
    }

    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        
        System.out.println("Original Queue: " + queue);
        
        Queue<Integer> result = modifyQueue(queue, 3);
        
        System.out.println("Modified Queue: " + result); // [3, 2, 1, 4, 5]
    }
}
