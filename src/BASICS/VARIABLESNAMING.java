package BASics ;

import java.util.Scanner;

public class VARIABLESNAMING {
    public static void main(String[] args) {
        System.out.print(" ENTER THE RADIUS : ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double a = 3.14 * r * r ;
        System.out.println(" YOUR AREA OF CIRCLE IS : " + a);
    }
}