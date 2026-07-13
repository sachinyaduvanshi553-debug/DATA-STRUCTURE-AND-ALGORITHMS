//package ARRAYS;
//
//import java.sql.SQLOutput;
//
//public class ARRAY1 {
//    public static void main (String[] args){
//        int[] x = {1,2,3,4,5,78,68,8};
//        System.out.println(x[0]);
//        System.out.println(x[1]);
//        System.out.println(x[2]);
//        System.out.println(x[3]);
//        System.out.println(x[4]);
//        System.out.println(x[5]);
//
//    }
//}



//
//package ARRAYS;
//
//import java.util.Scanner;
//
//public class ARRAY1 {
//    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("ENTER SIZE OF ELEMENT:");
//        int size = sc.nextInt();
//
//        int[] x = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.println("ENTER ELEMENT " + (i + 1) + ":");
//            x[i] = sc.nextInt();
//        }
//
//        // Printing array
//        System.out.println("ARRAY ELEMENTS ARE:");
//        for (int i = 0; i < size; i++) {
//            System.out.print(x[i] + " ");
//        }
//    }
//}




//
//package ARRAYS;
//
//import java.util.Scanner;
//
//public class ARRAY1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("ENTER NUMBER OF ROWS: ");
//        int rows = sc.nextInt();
//
//        System.out.print("ENTER NUMBER OF COLUMNS: ");
//        int columns = sc.nextInt();
//
//        int[][] x = new int[rows][columns];
//
//        // INPUT
//        System.out.println("ENTER ELEMENTS:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                x[i][j] = sc.nextInt();
//            }
//        }
//
//        // OUTPUT
//        System.out.println("ARRAY IS:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(x[i][j] + " ");
//            }
//            System.out.println(); // new line for each row
//        }
//    }
//}