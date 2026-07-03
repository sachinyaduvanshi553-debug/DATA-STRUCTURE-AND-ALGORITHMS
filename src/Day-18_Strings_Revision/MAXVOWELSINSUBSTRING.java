public class MAXVOWELSINSUBSTRING {

    private boolean isVowel(char c) {

        return "aeiou".indexOf(c) != -1;
    }

    public int maxVowels(String s, int k) {

        int current = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) {
                current++;
            }

            if (i >= k &&
                    isVowel(s.charAt(i - k))) {

                current--;
            }

            answer = Math.max(answer, current);
        }

        return answer;
    }

    public static void main(String[] args) {

        MAXVOWELSINSUBSTRING obj =
                new MAXVOWELSINSUBSTRING();

        System.out.println(
                obj.maxVowels("abciiidef", 3)
        );
    }
}