import java.util.LinkedList;
import java.util.Queue;

public class GENERATEBINARYNUMBERS {

    public static void generateBinaryNumbers(int n) {
        
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("1");
        
        System.out.println("Binary numbers from 1 to " + n + ":");
        
        // Process
        for (int i = 1; i <= n; i++) {
            String current = queue.poll();
            System.out.print(current + " ");
            
            queue.offer(current + "0");
            queue.offer(current + "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        generateBinaryNumbers(5);
        generateBinaryNumbers(10);
    }
}
