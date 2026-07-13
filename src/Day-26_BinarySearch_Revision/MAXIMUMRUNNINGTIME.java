public class MAXIMUMRUNNINGTIME {

    public long maxRunTime(int n, int[] batteries) {

        long sum = 0;

        for (int battery : batteries) {
            sum += battery;
        }

        long left = 0;
        long right = sum / n;

        while (left < right) {

            long mid = right - (right - left) / 2;

            long available = 0;

            for (int battery : batteries) {
                available += Math.min((long) battery, mid);
            }

            if (available >= mid * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        MAXIMUMRUNNINGTIME obj = new MAXIMUMRUNNINGTIME();

        int n = 2;
        int[] batteries = {3, 3, 3};

        System.out.println("Maximum Running Time = " +
                obj.maxRunTime(n, batteries));
    }
}