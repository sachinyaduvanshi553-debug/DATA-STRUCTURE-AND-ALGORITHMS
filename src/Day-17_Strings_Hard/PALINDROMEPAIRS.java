import java.util.List;

public class PALINDROMEPAIRS {

    public List<List<Integer>> palindromePairs(
            String[] words) {

        return null;
    }

    public static void main(String[] args) {

        PALINDROMEPAIRS obj =
                new PALINDROMEPAIRS();

        String[] words = {
                "abcd","dcba","lls","s","sssll"
        };

        System.out.println(
                obj.palindromePairs(words)
        );
    }
}