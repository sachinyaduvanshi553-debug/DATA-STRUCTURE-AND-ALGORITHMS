public class STRINGARRAYSEQUIVALENT {

    public boolean arrayStringsAreEqual(
            String[] word1,
            String[] word2) {

        return String.join("", word1)
                .equals(String.join("", word2));
    }

    public static void main(String[] args) {

        STRINGARRAYSEQUIVALENT obj =
                new STRINGARRAYSEQUIVALENT();

        String[] a = {"ab", "c"};
        String[] b = {"a", "bc"};

        System.out.println(
                obj.arrayStringsAreEqual(a, b)
        );
    }
}