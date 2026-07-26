import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class TaskNode {
    int count;
    int availableTime;
    
    TaskNode(int count, int availableTime) {
        this.count = count;
        this.availableTime = availableTime;
    }
}

public class TASKSCHEDULER {

    static int leastInterval(char[] tasks, int n) {
        
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) {
            if (f > 0) {
                pq.offer(f);
            }
        }
        
        Queue<TaskNode> queue = new LinkedList<>();
        int time = 0;
        
        while (!pq.isEmpty() || !queue.isEmpty()) {
            time++;
            
            if (!pq.isEmpty()) {
                int currentFreq = pq.poll();
                currentFreq--;
                if (currentFreq > 0) {
                    queue.offer(new TaskNode(currentFreq, time + n));
                }
            }
            
            if (!queue.isEmpty() && queue.peek().availableTime == time) {
                pq.offer(queue.poll().count);
            }
        }
        
        return time;
    }

    public static void main(String[] args) {
        
        char[] tasks1 = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n1 = 2;
        System.out.println("Time taken: " + leastInterval(tasks1, n1));
        
        char[] tasks2 = {'A', 'C', 'A', 'B', 'D', 'B'};
        int n2 = 1;
        System.out.println("Time taken: " + leastInterval(tasks2, n2));
    }
}
