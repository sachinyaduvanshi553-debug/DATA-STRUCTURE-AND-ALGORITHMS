import java.util.Stack;

public class REDUNDANTBRACES {

    static boolean hasRedundantBraces(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            
            if (c == ')') {
                boolean hasOperator = false;
                
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                }
                
                if (!stack.isEmpty()) stack.pop(); 
                
                if (!hasOperator) {
                    return true;
                }
                
            } else {
                stack.push(c);
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        
        String expr1 = "(a+b)";
        System.out.println("Expression: " + expr1 + " | Redundant Braces: " + hasRedundantBraces(expr1));
        
        String expr2 = "((a+b))";
        System.out.println("Expression: " + expr2 + " | Redundant Braces: " + hasRedundantBraces(expr2));
        
        String expr3 = "(a+(b)/c)";
        System.out.println("Expression: " + expr3 + " | Redundant Braces: " + hasRedundantBraces(expr3));
        
        String expr4 = "(a+b*(c-d))";
        System.out.println("Expression: " + expr4 + " | Redundant Braces: " + hasRedundantBraces(expr4));
    }
}
