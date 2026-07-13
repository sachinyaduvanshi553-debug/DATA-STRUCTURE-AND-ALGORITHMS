public class STRINGHALVESALIKE {

    public boolean halvesAreAlike(String s) {

        String vowels = "aeiouAEIOU";

        int count = 0;
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {

            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }

            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) {
                count--;
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {

        STRINGHALVESALIKE obj =
                new STRINGHALVESALIKE();

        System.out.println(
                obj.halvesAreAlike("book")
        );
    }
}