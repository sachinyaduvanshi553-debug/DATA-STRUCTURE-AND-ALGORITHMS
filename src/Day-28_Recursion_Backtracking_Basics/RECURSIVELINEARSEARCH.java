public class RECURSIVELINEARSEARCH {

    // Recursive Linear Search
    static int linearSearch(int[] arr, int index, int target) {

        // Base Case
        if (index == arr.length)
            return -1;

        // Target Found
        if (arr[index] == target)
            return index;

        // Recursive Call
        return linearSearch(arr, index + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {5, 12, 8, 20, 35, 40};

        int target = 20;

        int index = linearSearch(arr, 0, target);

        if (index != -1)
            System.out.println("Element Found at Index : " + index);
        else
            System.out.println("Element Not Found");
    }
}