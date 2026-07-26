import java.util.Stack;

public class INFIXTOPOSTFIX {

    // Operator precedence
    static int precedence(char ch) {

        switch (ch) {

            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            default:
                return -1;
        }
    }

    static String infixToPostfix(String expression) {

        StringBuilder result = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            // Operand
            if (Character.isLetterOrDigit(ch)) {

                result.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {

                stack.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {

                    result.append(stack.pop());
                }

                stack.pop();
            }

            // Operator
            else {

                while (!stack.isEmpty()
                        && precedence(ch) <= precedence(stack.peek())) {

                    result.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {

            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String expression = "A+B*(C-D)";

        System.out.println("Infix   : " + expression);

        System.out.println("Postfix : " +
                infixToPostfix(expression));
    }
}