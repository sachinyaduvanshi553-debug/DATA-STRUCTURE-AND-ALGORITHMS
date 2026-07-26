import java.util.Stack;
import java.util.Arrays;

public class ASTEROIDCOLLISION {

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        
        for (int ast : asteroids) {
            boolean exploded = false;
            
            // Check for collision
            while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                if (stack.peek() < -ast) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -ast) {
                    stack.pop();
                }
                exploded = true;
                break;
            }
            
            if (!exploded) {
                stack.push(ast);
            }
        }
        
        // Convert stack to array
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        
        return res;
    }


    public static void main(String[] args) {

        int[] asteroids1 = {5, 10, -5};
        System.out.println("Result 1: " + Arrays.toString(asteroidCollision(asteroids1))); // [5, 10]
        
        int[] asteroids2 = {8, -8};
        System.out.println("Result 2: " + Arrays.toString(asteroidCollision(asteroids2))); // []
    }
}
