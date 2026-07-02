import java.util.List;

public class SUBSTRINGCONCATENATIONOFALLWORDS {

    public List<Integer> findSubstring(
            String s,
            String[] words) {

        return null;
    }

    public static void main(String[] args) {

        SUBSTRINGCONCATENATIONOFALLWORDS obj =
                new SUBSTRINGCONCATENATIONOFALLWORDS();

        String[] words = {"foo", "bar"};

        System.out.println(
                obj.findSubstring("barfoothefoobarman", words)
        );
    }
}