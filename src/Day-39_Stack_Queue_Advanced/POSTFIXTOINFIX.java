import java.util.Stack;

public class POSTFIXTOINFIX {

    public static String postfixToInfix(String exp) {
        
        Stack<String> stack = new Stack<>();

        // Process expression left to right
        for (int i = 0; i < exp.length(); i++) {
            
            char c = exp.charAt(i);

            // If operand, push to stack
            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                
                // If operator, pop two operands
                String op1 = stack.pop();
                String op2 = stack.pop();

                // Format as infix and push back
                String temp = "(" + op2 + c + op1 + ")";
                stack.push(temp);
            }
        }

        // Final result is the only element left
        return stack.pop();
    }


    public static void main(String[] args) {
        
        System.out.println(postfixToInfix("ab*c+")); // Output: ((a*b)+c)
        System.out.println(postfixToInfix("abc++")); // Output: (a+(b+c))
        System.out.println(postfixToInfix("ab-c+")); // Output: ((a-b)+c)
    }
}
