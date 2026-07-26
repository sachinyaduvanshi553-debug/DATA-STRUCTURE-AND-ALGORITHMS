import java.util.Stack;

public class CELEBRITYPROBLEM {

    static boolean knows(int a, int b, int[][] matrix) {
        return matrix[a][b] == 1;
    }

    static int findCelebrity(int n, int[][] matrix) {

        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        while (stack.size() > 1) {
            
            int a = stack.pop();
            int b = stack.pop();

            if (knows(a, b, matrix)) {
                // a knows b, a is not a celebrity
                stack.push(b);
            } else {
                // a doesn't know b, b is not a celebrity
                stack.push(a);
            }
        }

        if (stack.isEmpty()) return -1;
        
        int candidate = stack.pop();

        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (knows(candidate, i, matrix) || !knows(i, candidate, matrix)) {
                    return -1;
                }
            }
        }

        return candidate;
    }


    public static void main(String[] args) {

        int[][] matrix1 = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };

        System.out.println("Celebrity in matrix1: " + findCelebrity(3, matrix1)); // 1
        
        int[][] matrix2 = {
            {0, 1},
            {1, 0}
        };

        System.out.println("Celebrity in matrix2: " + findCelebrity(2, matrix2)); // -1
    }
}
