public class FINDINMOUNTAINARRAY {

    // Simulated MountainArray Interface
    static class MountainArray {

        private final int[] arr;

        MountainArray(int[] arr) {
            this.arr = arr;
        }

        public int get(int index) {
            return arr[index];
        }

        public int length() {
            return arr.length;
        }
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

        int peak = findPeak(mountainArr, n);

        int left = binarySearchAscending(
                mountainArr,
                0,
                peak,
                target
        );

        if (left != -1)
            return left;

        return binarySearchDescending(
                mountainArr,
                peak + 1,
                n - 1,
                target
        );
    }

    // Find Peak Element
    private int findPeak(MountainArray arr, int n) {

        int left = 0;
        int right = n - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr.get(mid) < arr.get(mid + 1))
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }

    // Binary Search (Ascending Part)
    private int binarySearchAscending(
            MountainArray arr,
            int left,
            int right,
            int target) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int value = arr.get(mid);

            if (value == target)
                return mid;

            if (value < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    // Binary Search (Descending Part)
    private int binarySearchDescending(
            MountainArray arr,
            int left,
            int right,
            int target) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int value = arr.get(mid);

            if (value == target)
                return mid;

            if (value > target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        FINDINMOUNTAINARRAY obj =
                new FINDINMOUNTAINARRAY();

        int[] mountain = {1, 3, 5, 7, 6, 4, 2};

        MountainArray array =
                new MountainArray(mountain);

        int target = 6;

        int answer =
                obj.findInMountainArray(target, array);

        System.out.println("Target Index = " + answer);
    }
}