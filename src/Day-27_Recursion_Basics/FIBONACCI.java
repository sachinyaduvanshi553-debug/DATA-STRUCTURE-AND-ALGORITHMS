public class FIBONACCI {

    // Recursive Function
    static int fibonacci(int n) {

        // Base Cases
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        // Recursive Calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println("First " + n + " Fibonacci Numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();

        System.out.println("\n" + n + "th Fibonacci Number = " + fibonacci(n));
    }
}