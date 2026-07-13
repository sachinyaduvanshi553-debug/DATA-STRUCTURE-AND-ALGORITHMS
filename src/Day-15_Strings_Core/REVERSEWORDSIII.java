public class REVERSEWORDSIII {

    public String reverseWords(String s) {

        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            result.append(
                    new StringBuilder(word).reverse()
            ).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        REVERSEWORDSIII obj =
                new REVERSEWORDSIII();

        System.out.println(
                obj.reverseWords(
                        "Let's take LeetCode contest"
                )
        );
    }
}