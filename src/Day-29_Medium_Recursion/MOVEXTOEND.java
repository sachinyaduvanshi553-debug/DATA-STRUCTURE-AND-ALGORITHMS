public class MOVEXTOEND {

    // Recursive Function
    static String moveX(String str) {

        // Base Case
        if (str.length() == 0)
            return "";

        char current = str.charAt(0);

        String remaining = moveX(str.substring(1));

        if (current == 'x' || current == 'X')
            return remaining + current;

        return current + remaining;
    }

    public static void main(String[] args) {

        String str = "axbcxxdex";

        System.out.println("Original String : " + str);
        System.out.println("After Moving x to End : " + moveX(str));
    }
}