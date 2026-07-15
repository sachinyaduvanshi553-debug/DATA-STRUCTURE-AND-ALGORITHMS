public class RECURSIVEBINARYSEARCH {

    // Recursive Binary Search
    static int binarySearch(int[] arr, int left, int right, int target) {

        // Base Case
        if (left > right)
            return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid])
            return binarySearch(arr, left, mid - 1, target);

        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 10, 15, 20, 25, 30};

        int target = 20;

        int index = binarySearch(arr, 0, arr.length - 1, target);

        if (index != -1)
            System.out.println("Element Found at Index : " + index);
        else
            System.out.println("Element Not Found");
    }
}