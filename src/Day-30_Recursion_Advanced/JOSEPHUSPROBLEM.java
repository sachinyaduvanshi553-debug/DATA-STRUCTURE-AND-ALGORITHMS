public class JOSEPHUSPROBLEM {


    static int josephus(int n, int k) {

        // Base Case
        if (n == 1)
            return 0;


        // Recursive Relation
        return (josephus(n - 1, k) + k) % n;
    }


    public static void main(String[] args) {


        int people = 7;
        int step = 3;


        int survivor = josephus(people, step);


        // Convert 0-indexed answer to 1-indexed
        System.out.println(
                "Survivor Position : "
                        + (survivor + 1)
        );
    }
}