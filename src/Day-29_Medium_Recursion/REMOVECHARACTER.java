public class REMOVECHARACTER {

    // Recursive Function
    static String removeCharacter(String str, char ch) {

        // Base Case
        if (str.length() == 0)
            return "";

        char current = str.charAt(0);

        // Recursive Call
        String remaining = removeCharacter(str.substring(1), ch);

        if (current == ch)
            return remaining;

        return current + remaining;
    }

    public static void main(String[] args) {

        String str = "recursion";
        char ch = 'r';

        System.out.println("Original String : " + str);
        System.out.println("After Removing '" + ch + "' : "
                + removeCharacter(str, ch));
    }
}