import java.util.Stack;

public class EVALUATEREVERSEPOLISHNOTATION {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            
            // Process operators
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                
                // Process numbers
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }


    public static void main(String[] args) {

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println("Result 1: " + evalRPN(tokens1)); // 9
        
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println("Result 2: " + evalRPN(tokens2)); // 6
    }
}
