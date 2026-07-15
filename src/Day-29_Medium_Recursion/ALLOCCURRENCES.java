import java.util.ArrayList;

public class ALLOCCURRENCES {

    // Recursive Function
    static void findOccurrences(int[] arr, int index, int target,
                                ArrayList<Integer> result) {

        // Base Case
        if (index == arr.length)
            return;

        // Current Element
        if (arr[index] == target)
            result.add(index);

        // Recursive Call
        findOccurrences(arr, index + 1, target, result);
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 5, 9, 5, 12};

        int target = 5;

        ArrayList<Integer> result = new ArrayList<>();

        findOccurrences(arr, 0, target, result);

        System.out.println("Target : " + target);
        System.out.println("Occurrences at Indexes : " + result);
    }
}