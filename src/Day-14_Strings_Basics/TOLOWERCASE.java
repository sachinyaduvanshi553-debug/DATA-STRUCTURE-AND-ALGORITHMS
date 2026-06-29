public class TOLOWERCASE {

    public String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }

            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        TOLOWERCASE obj = new TOLOWERCASE();

        System.out.println(
                obj.toLowerCase("Hello WORLD")
        );
    }
}