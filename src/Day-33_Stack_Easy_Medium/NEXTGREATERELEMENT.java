import java.util.HashMap;
import java.util.Stack;
import java.util.Arrays;

public class NEXTGREATERELEMENT {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int num : nums2) {
            
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }


    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        
        int[] result = nextGreaterElement(nums1, nums2);
        
        System.out.println(Arrays.toString(result)); // [-1, 3, -1]
    }
}
