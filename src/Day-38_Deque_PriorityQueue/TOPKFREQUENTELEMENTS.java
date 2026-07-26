import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Arrays;

public class TOPKFREQUENTELEMENTS {

    public static int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));
        
        for (int num : freqMap.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }
        
        return result;
    }


    public static void main(String[] args) {
        
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        
        System.out.println(Arrays.toString(topKFrequent(nums, k))); // [1, 2]
    }
}
