import java.util.Stack;

public class SUMOFSUBARRAYMINIMUMS {

    public static int sumSubarrayMins(int[] arr) {

        int MOD = 1000000007;
        Stack<Integer> stack = new Stack<>();
        long sumOfMins = 0;
        int n = arr.length;
        
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
                int rightBoundary = i;
                
                long count = (long) (mid - leftBoundary) * (rightBoundary - mid) % MOD;
                sumOfMins += (count * arr[mid]) % MOD;
                sumOfMins %= MOD;
            }
            stack.push(i);
        }
        
        return (int) sumOfMins;
    }


    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};
        System.out.println("Sum of subarray minimums: " + sumSubarrayMins(arr)); // 17
    }
}
