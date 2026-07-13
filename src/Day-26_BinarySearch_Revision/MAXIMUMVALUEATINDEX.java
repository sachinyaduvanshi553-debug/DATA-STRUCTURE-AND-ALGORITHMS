public class MAXIMUMVALUEATINDEX {

    public int maxValue(int n, int index, int maxSum) {

        int left = 1;
        int right = maxSum;

        while (left < right) {

            int mid = left + (right - left + 1) / 2;

            if (isPossible(n, index, maxSum, mid))
                left = mid;
            else
                right = mid - 1;
        }

        return left;
    }

    private boolean isPossible(int n,
                               int index,
                               int maxSum,
                               int value) {

        long leftSum = calculate(value - 1, index);

        long rightSum = calculate(value - 1,
                n - index - 1);

        long total = leftSum + rightSum + value;

        return total <= maxSum;
    }

    private long calculate(long peak,
                           int length) {

        if (peak >= length) {

            long first = peak;
            long last = peak - length + 1;

            return (first + last) * length / 2;
        }

        long decreasing = (peak + 1) * peak / 2;

        long ones = length - peak;

        return decreasing + ones;
    }

    public static void main(String[] args) {

        MAXIMUMVALUEATINDEX obj =
                new MAXIMUMVALUEATINDEX();

        int n = 6;
        int index = 1;
        int maxSum = 10;

        System.out.println(
                "Maximum Value = " +
                        obj.maxValue(n, index, maxSum));
    }
}