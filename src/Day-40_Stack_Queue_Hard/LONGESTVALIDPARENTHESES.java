import java.util.Stack;

public class LONGESTVALIDPARENTHESES {

    static int longestValidParentheses(String s) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base for initial length calculation
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }


    public static void main(String[] args) {
        
        System.out.println(longestValidParentheses("(()")); // 2
        System.out.println(longestValidParentheses(")()())")); // 4
        System.out.println(longestValidParentheses("")); // 0
    }
}
