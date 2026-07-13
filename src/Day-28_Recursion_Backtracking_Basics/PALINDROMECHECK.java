public class PALINDROMECHECK {

    // Recursive function to check palindrome
    static boolean isPalindrome(String str, int left, int right) {

        // Base Case
        if (left >= right)
            return true;

        // Characters don't match
        if (str.charAt(left) != str.charAt(right))
            return false;

        // Recursive Call
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String str = "madam";

        if (isPalindrome(str, 0, str.length() - 1))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is Not a Palindrome");
    }
}