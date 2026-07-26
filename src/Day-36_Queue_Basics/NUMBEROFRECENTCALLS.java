import java.util.LinkedList;
import java.util.Queue;

public class NUMBEROFRECENTCALLS {

    static class RecentCounter {
        private Queue<Integer> q;

        public RecentCounter() {
            q = new LinkedList<>();
        }

        // Process ping
        public int ping(int t) {
            q.add(t);

            while (q.peek() < t - 3000) {
                q.poll();
            }

            return q.size();
        }
    }


    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();

        System.out.println(counter.ping(1));    // 1
        System.out.println(counter.ping(100));  // 2
        System.out.println(counter.ping(3001)); // 3
        System.out.println(counter.ping(3002)); // 3
    }
}
