import java.util.ArrayList;

public class GENERATEPERMUTATIONS {


    static void generatePermutations(
            int[] arr,
            ArrayList<Integer> current,
            boolean[] used) {


        // Base Case

        if (current.size() == arr.length) {

            System.out.println(current);

            return;
        }



        for (int i = 0; i < arr.length; i++) {


            // Skip already used element

            if (used[i])
                continue;



            // Choose element

            used[i] = true;

            current.add(arr[i]);



            // Recursive call

            generatePermutations(
                    arr,
                    current,
                    used
            );



            // Backtrack

            current.remove(current.size() - 1);

            used[i] = false;
        }
    }



    public static void main(String[] args) {


        int[] arr = {1, 2, 3};


        boolean[] used = new boolean[arr.length];


        System.out.println("All Permutations:");

        generatePermutations(
                arr,
                new ArrayList<>(),
                used
        );
    }
}