package ARRAYS;

public class SEGREGATE01 {
    public static void main(String[] args) {

        int[] arr = {1,0,1,0,1,0,0,1,1,0};

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            // Move left pointer until 1 is found
            while(arr[left] == 0 && left < right){
                left++;
            }

            // Move right pointer until 0 is found
            while(arr[right] == 1 && left < right){
                right--;
            }

            // Swap
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // Print result
        System.out.print("Segregated Array: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}