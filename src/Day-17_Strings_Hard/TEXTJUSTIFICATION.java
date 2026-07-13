import java.util.List;

public class TEXTJUSTIFICATION {

    public List<String> fullJustify(
            String[] words,
            int maxWidth) {

        return null;
    }

    public static void main(String[] args) {

        TEXTJUSTIFICATION obj =
                new TEXTJUSTIFICATION();

        String[] words = {
                "This","is","an","example",
                "of","text","justification."
        };

        System.out.println(
                obj.fullJustify(words, 16)
        );
    }
}