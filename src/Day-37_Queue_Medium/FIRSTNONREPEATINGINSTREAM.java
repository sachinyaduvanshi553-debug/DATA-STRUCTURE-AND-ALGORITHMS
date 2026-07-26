import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FIRSTNONREPEATINGINSTREAM {

    public static String FirstNonRepeating(String stream) {
        
        Map<Character, Integer> freqMap = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        
        // Process each character
        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            queue.offer(ch);
            
            // Check for the first non-repeating
            while (!queue.isEmpty() && freqMap.get(queue.peek()) > 1) {
                queue.poll();
            }
            
            if (queue.isEmpty()) {
                result.append("#");
            } else {
                result.append(queue.peek());
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        
        String stream1 = "aabc";
        System.out.println("Stream: " + stream1 + " -> Result: " + FirstNonRepeating(stream1)); // a#bb
        
        String stream2 = "zz";
        System.out.println("Stream: " + stream2 + " -> Result: " + FirstNonRepeating(stream2)); // z#
    }
}
