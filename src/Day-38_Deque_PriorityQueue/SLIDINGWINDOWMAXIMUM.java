import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class SLIDINGWINDOWMAXIMUM {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        
        if (nums == null || k <= 0) return new int[0];
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;
        
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            
            // Remove indices out of window
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            
            // Remove elements smaller than current from back
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            
            q.offer(i);
            
            if (i >= k - 1) {
                result[ri++] = nums[q.peek()];
            }
        }
        
        return result;
    }


    public static void main(String[] args) {
        
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k))); 
        // [3, 3, 5, 5, 6, 7]
    }
}
