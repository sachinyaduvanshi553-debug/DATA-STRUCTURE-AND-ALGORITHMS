import java.util.Arrays;
import java.util.Stack;

public class NEXTGREATERELEMENT2 {


    static int[] nextGreaterElements(int[] nums) {


        int n = nums.length;


        int[] result = new int[n];


        Arrays.fill(result, -1);


        Stack<Integer> stack = new Stack<>();



        // Traverse twice because array is circular

        for (int i = 2 * n - 1; i >= 0; i--) {


            int current = nums[i % n];



            while (!stack.isEmpty()
                    && stack.peek() <= current) {


                stack.pop();
            }



            if (i < n) {


                if (!stack.isEmpty()) {

                    result[i] = stack.peek();
                }
            }



            stack.push(current);
        }


        return result;
    }



    static void print(int[] arr) {


        for (int value : arr) {

            System.out.print(value + " ");
        }


        System.out.println();
    }



    public static void main(String[] args) {


        int[] nums = {1,2,1};


        System.out.println("Original Array:");

        print(nums);



        int[] answer = nextGreaterElements(nums);



        System.out.println("Next Greater Elements:");

        print(answer);

    }
}