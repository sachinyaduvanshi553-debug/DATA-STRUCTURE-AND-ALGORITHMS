package ARRAYS;

import java.util.Scanner;

public class ROTATION {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of d: ");
        int d = sc.nextInt();

        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int n = arr.length;

        d = d % n;

        int[] temp = new int[n];

        // Shift elements
        for(int i = 0; i < n - d; i++){
            temp[i] = arr[i + d];
        }

        // Move first d elements to end
        for(int i = 0; i < d; i++){
            temp[n - d + i] = arr[i];
        }

        System.out.print("Rotated Array: ");
        for(int x : temp){
            System.out.print(x + " ");
        }

        sc.close();
    }
}