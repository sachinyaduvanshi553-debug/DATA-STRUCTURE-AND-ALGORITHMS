public class REMOVEADJACENTDUPLICATES {

    public static String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int len = sb.length();
            
            // Check if top of StringBuilder matches current char
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }


    public static void main(String[] args) {

        String s = "abbaca";
        System.out.println("Original: " + s);
        System.out.println("Result: " + removeDuplicates(s)); // "ca"
    }
}
