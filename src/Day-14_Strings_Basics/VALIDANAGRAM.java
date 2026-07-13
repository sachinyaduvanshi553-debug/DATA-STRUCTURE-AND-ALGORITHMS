public class VALIDANAGRAM {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int x : freq) {

            if (x != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        VALIDANAGRAM obj = new VALIDANAGRAM();

        System.out.println(
                obj.isAnagram("anagram", "nagaram")
        );
    }
}