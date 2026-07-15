import java.util.ArrayList;

public class GENERATESUBSETS {


    static void generateSubsets(int[] arr,
                                int index,
                                ArrayList<Integer> current) {


        // Base Case
        if (index == arr.length) {

            System.out.println(current);

            return;
        }


        // Include current element

        current.add(arr[index]);

        generateSubsets(arr,
                index + 1,
                current);



        // Backtrack (remove element)

        current.remove(current.size() - 1);



        // Exclude current element

        generateSubsets(arr,
                index + 1,
                current);
    }



    public static void main(String[] args) {


        int[] arr = {1, 2, 3};


        System.out.println("All Subsets:");

        generateSubsets(arr,
                0,
                new ArrayList<>());
    }
}