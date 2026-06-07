//package SORTING_ALGOS;
//
//class SelectionSort {
//
//    // Print function
//    public static void print(int[] arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {5, -2, 6, 7, 2, 8, 2};
//        int n = arr.length;
//
//        System.out.print("Before Sorting: ");
//        print(arr);
//
//        // Selection Sort
//        for(int i = 0; i < n - 1; i++){
//            int mindx = i;
//
//            for(int j = i + 1; j < n; j++){
//                if(arr[j] < arr[mindx]){
//                    mindx = j;
//                }
//            }
//
//            // Swap
//            int temp = arr[i];
//            arr[i] = arr[mindx];
//            arr[mindx] = temp;
//        }
//
//        System.out.print("After Sorting: ");
//        print(arr);
//    }
//}