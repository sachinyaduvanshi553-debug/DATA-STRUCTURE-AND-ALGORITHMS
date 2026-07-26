import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class DLLNode {
    int data;
    DLLNode prev, next;
    DLLNode(int data) { this.data = data; }
}

class MidStack {
    DLLNode head;
    DLLNode mid;
    int size;

    void push(int data) {
        DLLNode newNode = new DLLNode(data);
        if (size == 0) {
            head = newNode;
            mid = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            if (size % 2 != 0) {
                mid = mid.prev;
            }
        }
        size++;
    }

    int pop() {
        if (size == 0) return -1;
        int val = head.data;
        if (size == 1) {
            head = null;
            mid = null;
        } else {
            head = head.next;
            head.prev = null;
            if (size % 2 == 0) {
                mid = mid.next;
            }
        }
        size--;
        return val;
    }

    int findMiddle() {
        if (size == 0) return -1;
        return mid.data;
    }
}

public class REVISION {

    // PROBLEM 1 - Palindrome Check Using Stack
    static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            stack.push(s.charAt(i));
        }
        int start = len / 2;
        if (len % 2 != 0) start++;
        for (int i = start; i < len; i++) {
            if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // PROBLEM 2 - Reverse a queue using recursion
    static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) return;
        int x = q.poll();
        reverseQueue(q);
        q.offer(x);
    }

    // PROBLEM 3 - Check if a queue can be sorted into another queue using a stack
    static boolean checkSorted(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        int expected = 1;
        int n = q.size();
        
        while (!q.isEmpty()) {
            int front = q.poll();
            if (front == expected) {
                expected++;
            } else {
                if (!stack.isEmpty() && stack.peek() < front) {
                    return false;
                }
                stack.push(front);
            }
            while (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            }
        }
        
        return expected - 1 == n && stack.isEmpty();
    }
    
    // PROBLEM 4 - Implement a stack that returns middle element in O(1) using a DLL
    // Handled in MidStack class
    
    // PROBLEM 5 - Find if an expression has duplicate parentheses using a stack
    static boolean hasDuplicateParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                char top = stack.peek();
                stack.pop();
                
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = stack.peek();
                    stack.pop();
                }
                
                if (elementsInside == 0) {
                    return true;
                }
            } else {
                stack.push(ch);
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        
        System.out.println("--- Problem 1: Palindrome Check ---");
        System.out.println("racecar: " + isPalindrome("racecar"));
        System.out.println("hello: " + isPalindrome("hello"));
        System.out.println();
        
        System.out.println("--- Problem 2: Reverse Queue ---");
        Queue<Integer> q = new LinkedList<>();
        q.offer(1); q.offer(2); q.offer(3);
        System.out.println("Original: " + q);
        reverseQueue(q);
        System.out.println("Reversed: " + q);
        System.out.println();
        
        System.out.println("--- Problem 3: Check Queue Sortable ---");
        Queue<Integer> q2 = new LinkedList<>();
        q2.offer(5); q2.offer(1); q2.offer(2); q2.offer(3); q2.offer(4);
        System.out.println("Sortable? " + checkSorted(q2));
        System.out.println();
        
        System.out.println("--- Problem 4: MidStack ---");
        MidStack ms = new MidStack();
        ms.push(11);
        ms.push(22);
        ms.push(33);
        System.out.println("Mid: " + ms.findMiddle());
        ms.pop();
        System.out.println("Mid after pop: " + ms.findMiddle());
        System.out.println();
        
        System.out.println("--- Problem 5: Duplicate Parentheses ---");
        System.out.println("((a+b)): " + hasDuplicateParentheses("((a+b))"));
        System.out.println("(a+b): " + hasDuplicateParentheses("(a+b)"));
    }
}
