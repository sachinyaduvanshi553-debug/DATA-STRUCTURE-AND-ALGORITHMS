import java.util.Stack;
import java.util.Arrays;

public class DAILYTEMPERATURES {

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>(); // stores indices
        
        for (int i = 0; i < temperatures.length; i++) {
            
            // Pop until current temperature is not warmer than the top
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        
        return answer;
    }


    public static void main(String[] args) {

        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temps);
        System.out.println("Result: " + Arrays.toString(result)); // [1, 1, 4, 2, 1, 1, 0, 0]
    }
}
