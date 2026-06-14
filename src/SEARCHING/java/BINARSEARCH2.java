public class FirstOccurrence {

    public static int firstOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                ans = mid;
                high = mid - 1;
            }

            else if (arr[mid] < target) {

                low = mid + 1;
            }

            else {

                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,4,4,4,7};

        System.out.println(firstOccurrence(arr, 4));
    }
}