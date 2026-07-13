public class KTHSMALLESTPRODUCTOFTWOSORTEDARRAYS {

    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {

        long low = -10000000000L;
        long high = 10000000000L;

        while (low < high) {

            long mid = low + (high - low) / 2;

            if (countLessOrEqual(nums1, nums2, mid) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private long countLessOrEqual(int[] nums1, int[] nums2, long target) {

        long count = 0;
        int n = nums2.length;

        for (int x : nums1) {

            if (x > 0) {

                int left = 0;
                int right = n;

                while (left < right) {

                    int mid = left + (right - left) / 2;

                    if ((long) x * nums2[mid] <= target) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }

                count += left;

            } else if (x < 0) {

                int left = 0;
                int right = n;

                while (left < right) {

                    int mid = left + (right - left) / 2;

                    if ((long) x * nums2[mid] <= target) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }

                count += n - left;

            } else {

                if (target >= 0) {
                    count += n;
                }
            }
        }

        return count;
    }