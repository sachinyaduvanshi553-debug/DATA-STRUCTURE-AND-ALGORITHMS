import java.util.Stack;

public class REMOVEKDIGITS {

    public static String removeKdigits(String num, int k) {
        
        Stack<Character> stack = new Stack<>();

        // Process each digit
        for (char c : num.toCharArray()) {
            
            // Maintain monotonic increasing stack
            while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;
            }
            
            stack.push(c);
        }

        // If k > 0, remove remaining digits from the end
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build the result string
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }


    public static void main(String[] args) {
        
        System.out.println(removeKdigits("1432219", 3)); // Output: "1219"
        System.out.println(removeKdigits("10200", 1));   // Output: "200"
        System.out.println(removeKdigits("10", 2));      // Output: "0"
    }
}
