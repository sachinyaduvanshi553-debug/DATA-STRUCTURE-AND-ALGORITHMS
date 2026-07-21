import java.util.Stack;

public class DAILYTEMPERATURES {

    static int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();


        // Traverse from Right to Left

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty()
                    && temperatures[stack.peek()] <= temperatures[i]) {

                stack.pop();
            }

            if (stack.isEmpty()) {

                answer[i] = 0;

            } else {

                answer[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return answer;
    }


    static void print(int[] arr) {

        for (int value : arr) {

            System.out.print(value + " ");
        }

        System.out.println();
    }


    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        System.out.println("Temperatures:");

        print(temperatures);

        System.out.println("Answer:");

        print(dailyTemperatures(temperatures));
    }
}