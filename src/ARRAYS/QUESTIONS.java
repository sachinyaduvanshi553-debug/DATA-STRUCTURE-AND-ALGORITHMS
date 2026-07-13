//package ARRAYS;
//
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class QUESTIONS {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("ENTER SIZE OF ARRAY:");
//        int size = sc.nextInt();
//
//        int[] arr = new int[size];
//
//        // INPUT
//        System.out.println("ENTER ELEMENTS:");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // LOGIC
//        for (int i = 0; i < size; i++) {
//            if (i % 2 == 0) {
//                arr[i] = arr[i] * 2;
//            } else {
//                arr[i] = arr[i] + 10;
//            }
//        }
//
//        // OUTPUT
//        System.out.println("UPDATED ARRAY:");
//        System.out.println(Arrays.toString(arr));
//    }
//}











// SEARCHING IN AN ARRAY

//package ARRAYS;
//
//import java.util.Scanner;
//
//public class QUESTIONS {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("ENTER ELEMENT TO BE SEARCHED IN ARRAY: ");
//        int element = sc.nextInt();
//
//        int[] arr = {1,2,3,4,5,6,7,8,9,0};
//        boolean found = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == element) {
//                found = true;
//                break;
//            }
//        }
//
//        if (found) {
//            System.out.println("ELEMENT IS PRESENT");
//        } else {
//            System.out.println("ELEMENT IS NOT PRESENT");
//        }
//    }
//}