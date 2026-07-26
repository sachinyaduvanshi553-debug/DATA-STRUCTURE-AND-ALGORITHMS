import java.util.Deque;
import java.util.LinkedList;

public class SIMPLIFYPATH {

    public static String simplifyPath(String path) {
        
        Deque<String> stack = new LinkedList<>();
        String[] components = path.split("/");

        // Process each component
        for (String dir : components) {
            
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!dir.equals("") && !dir.equals(".")) {
                stack.push(dir);
            }
        }

        // Construct the simplified path
        StringBuilder sb = new StringBuilder();
        
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.pollLast());
        }

        // Return "/" if empty
        return sb.length() == 0 ? "/" : sb.toString();
    }


    public static void main(String[] args) {
        
        System.out.println(simplifyPath("/home/"));              // Output: "/home"
        System.out.println(simplifyPath("/../"));                // Output: "/"
        System.out.println(simplifyPath("/home//foo/"));         // Output: "/home/foo"
        System.out.println(simplifyPath("/a/./b/../../c/"));     // Output: "/c"
    }
}
