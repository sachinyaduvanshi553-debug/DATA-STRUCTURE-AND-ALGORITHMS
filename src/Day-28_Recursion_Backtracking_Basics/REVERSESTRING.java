public class REVERSESTRING {

    // Recursive function to reverse a string
    static String reverse(String str) {

        // Base Case
        if (str.length() == 0)
            return "";

        // Recursive Call
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String str = "Recursion";

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reverse(str));
    }
}