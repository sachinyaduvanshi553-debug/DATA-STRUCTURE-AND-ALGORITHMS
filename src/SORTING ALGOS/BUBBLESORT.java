//package SORTING_ALGO;
//
//import java.util.Scanner;
//
//public class BUBBLESORT {
//    public static void main(String args[]) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("ENTER SIZE OF ARRAY:");
//        int size = sc.nextInt();
//
//        int[] arr = new int[size];
//
//        // Input array
//        for (int i = 0; i < size; i++) {
//            System.out.println("ENTER ELEMENT " + i + " : ");
//            arr[i] = sc.nextInt();
//        }
//
//        // Bubble Sort Logic
//        for (int i = 0; i < size - 1; i++) {
//            for (int j = 0; j < size - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        // Print sorted array
//        System.out.println("SORTED ARRAY IS:");
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        sc.close();
//    }
//}


































// REVERSE BUBBLE SORTING
//
//
//package SORTING_ALGO;
//
//import java.util.Scanner;
//
//public class BUBBLESORT {
//    public static void main(String args[]) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("ENTER SIZE OF ARRAY:");
//        int size = sc.nextInt();
//
//        int[] arr = new int[size];
//
//        // Input array
//        for (int i = 0; i < size; i++) {
//            System.out.println("ENTER ELEMENT " + i + " : ");
//            arr[i] = sc.nextInt();
//        }
//
//        // Bubble Sort Logic
//        for (int i = 0; i < size - 1; i++) {
//            for (int j = 0; j < size - i - 1; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        // Print sorted array
//        System.out.println("SORTED ARRAY IS:");
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        sc.close();
//    }
//}