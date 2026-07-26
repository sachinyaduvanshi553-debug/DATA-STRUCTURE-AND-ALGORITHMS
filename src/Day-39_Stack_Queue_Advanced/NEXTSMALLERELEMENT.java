import java.util.Stack;
import java.util.Arrays;

public class NEXTSMALLERELEMENT {

    public static int[] nextSmallerElement(int[] arr) {
        
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse right to left
        for (int i = n - 1; i >= 0; i--) {
            
            // Pop elements greater than or equal to current element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // Assign next smaller element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push current element
            stack.push(arr[i]);
        }

        return result;
    }


    public static void main(String[] args) {
        
        int[] arr1 = {4, 8, 5, 2, 25};
        System.out.println(Arrays.toString(nextSmallerElement(arr1))); // Output: [2, 5, 2, -1, -1]

        int[] arr2 = {13, 7, 6, 12};
        System.out.println(Arrays.toString(nextSmallerElement(arr2))); // Output: [7, 6, -1, -1]
    }
}
