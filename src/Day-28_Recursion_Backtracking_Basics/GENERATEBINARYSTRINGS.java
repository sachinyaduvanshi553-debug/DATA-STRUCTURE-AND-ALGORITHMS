public class GENERATEBINARYSTRINGS {

    // Backtracking Function
    static void generateBinaryStrings(char[] arr, int index) {

        // Base Case
        if (index == arr.length) {

            System.out.println(new String(arr));
            return;
        }

        // Choose 0
        arr[index] = '0';
        generateBinaryStrings(arr, index + 1);

        // Choose 1
        arr[index] = '1';
        generateBinaryStrings(arr, index + 1);
    }

    public static void main(String[] args) {

        int n = 3;

        char[] arr = new char[n];

        System.out.println("Binary Strings of Length " + n + " :\n");

        generateBinaryStrings(arr, 0);
    }
}