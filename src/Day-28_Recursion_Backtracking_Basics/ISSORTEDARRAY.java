public class ISSORTEDARRAY {

    // Recursive Function to check if array is sorted
    static boolean isSorted(int[] arr, int index) {

        // Base Case
        if (index == arr.length - 1)
            return true;

        // If current element is greater than next element
        if (arr[index] > arr[index + 1])
            return false;

        // Recursive Call
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 15};

        if (isSorted(arr, 0))
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is Not Sorted");
    }
}