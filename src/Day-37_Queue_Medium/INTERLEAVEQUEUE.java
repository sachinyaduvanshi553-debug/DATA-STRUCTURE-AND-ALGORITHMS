import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class INTERLEAVEQUEUE {

    public static void interleave(Queue<Integer> q) {
        
        if (q.size() % 2 != 0) {
            System.out.println("Queue size must be even");
            return;
        }
        
        int halfSize = q.size() / 2;
        Queue<Integer> firstHalf = new LinkedList<>();
        
        // Store first half of the queue
        for (int i = 0; i < halfSize; i++) {
            firstHalf.offer(q.poll());
        }
        
        // Process interleaving
        while (!firstHalf.isEmpty()) {
            q.offer(firstHalf.poll());
            q.offer(q.poll());
        }
    }

    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        
        System.out.println("Original Queue: " + queue);
        
        interleave(queue);
        
        System.out.println("Interleaved Queue: " + queue); // [1, 4, 2, 5, 3, 6]
    }
}
