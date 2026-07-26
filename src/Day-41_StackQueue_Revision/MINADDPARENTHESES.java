public class MINADDPARENTHESES {

    static int minAddToMakeValid(String s) {
        
        int openCount = 0;
        int additions = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                if (openCount > 0) {
                    openCount--;
                } else {
                    additions++;
                }
            }
        }
        
        return additions + openCount;
    }

    public static void main(String[] args) {
        
        System.out.println("Original: '())' -> Additions needed: " + minAddToMakeValid("())")); // 1
        System.out.println("Original: '(((' -> Additions needed: " + minAddToMakeValid("(((")); // 3
        System.out.println("Original: '()' -> Additions needed: " + minAddToMakeValid("()")); // 0
        System.out.println("Original: '()))((' -> Additions needed: " + minAddToMakeValid("()))((")); // 4
    }
}
