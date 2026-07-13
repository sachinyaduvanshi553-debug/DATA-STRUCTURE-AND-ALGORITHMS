public class LONGESTPALINDROMICSUBSTRING {

    private int start = 0;
    private int maxLength = 1;

    public String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++) {

            expand(s, i, i);
            expand(s, i, i + 1);
        }

        return s.substring(start, start + maxLength);
    }

    private void expand(String s, int left, int right) {

        while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {

            if (right - left + 1 > maxLength) {

                start = left;
                maxLength = right - left + 1;
            }

            left--;
            right++;
        }
    }
}