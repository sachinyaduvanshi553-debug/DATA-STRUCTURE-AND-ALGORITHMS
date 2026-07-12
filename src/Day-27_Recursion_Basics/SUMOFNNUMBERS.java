public class SUMOFNNUMBERS {

    // Recursive Function
    static int findSum(int n) {

        if (n == 1)
            return 1;

        return n + findSum(n - 1);
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println("Sum of first " + n + " numbers = "
                + findSum(n));
    }
}