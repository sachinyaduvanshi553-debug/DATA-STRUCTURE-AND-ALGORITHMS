public class KTHSMALLESTPRIMEFRACTION {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        double left = 0.0;
        double right = 1.0;

        int numerator = 0;
        int denominator = 1;

        while (true) {

            double mid = (left + right) / 2;

            int count = 0;

            numerator = 0;
            denominator = 1;

            int j = 1;

            for (int i = 0; i < arr.length - 1; i++) {

                while (j < arr.length &&
                        arr[i] > mid * arr[j]) {
                    j++;
                }

                if (j == arr.length)
                    break;

                count += arr.length - j;

                if ((long) numerator * arr[j] <
                        (long) denominator * arr[i]) {

                    numerator = arr[i];
                    denominator = arr[j];
                }
            }

            if (count == k)
                return new int[]{numerator, denominator};

            if (count < k)
                left = mid;
            else
                right = mid;
        }
    }

    public static void main(String[] args) {

        KTHSMALLESTPRIMEFRACTION obj =
                new KTHSMALLESTPRIMEFRACTION();

        int[] arr = {1, 2, 3, 5};

        int k = 3;

        int[] answer =
                obj.kthSmallestPrimeFraction(arr, k);

        System.out.println(
                answer[0] + "/" + answer[1]);
    }
}