import java.util.Stack;

public class NEXTGREATERELEMENT {

    static int[] nextGreaterElement(int[] arr) {

        int n = arr.length;

        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();


        // Traverse from Right to Left

        for (int i = n - 1; i >= 0; i--) {


            while (!stack.isEmpty()
                    && stack.peek() <= arr[i]) {

                stack.pop();
            }


            if (stack.isEmpty()) {

                answer[i] = -1;

            } else {

                answer[i] = stack.peek();
            }


            stack.push(arr[i]);
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

        int[] arr = {2, 1, 5, 3, 4};

        System.out.println("Original Array:");

        print(arr);

        int[] answer = nextGreaterElement(arr);

        System.out.println("Next Greater Elements:");

        print(answer);
    }
}