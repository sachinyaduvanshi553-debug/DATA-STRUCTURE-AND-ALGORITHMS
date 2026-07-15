public class SUBSEQUENCES {

    // Recursive Function
    static void generateSubsequences(String str,
                                     int index,
                                     String current) {

        // Base Case
        if (index == str.length()) {

            System.out.println(current);
            return;
        }

        // Include Current Character
        generateSubsequences(
                str,
                index + 1,
                current + str.charAt(index)
        );

        // Exclude Current Character
        generateSubsequences(
                str,
                index + 1,
                current
        );
    }

    public static void main(String[] args) {

        String str = "ABC";

        System.out.println("All Subsequences:\n");

        generateSubsequences(str, 0, "");
    }
}