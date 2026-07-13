package BASICS;

public class AREA {

    public static void main(String[] args) {

        int r = 5;
        float pie = 3.14f;

        float area1 = pie * r * r;
        int area2 = (int)(pie * r * r);   // type casting
        double area3 = pie * r * r;

        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
    }
}