import java.util.Deque;
import java.util.ArrayDeque;

public class FRONTMIDDLEBACKQUEUE {

    private Deque<Integer> left;
    private Deque<Integer> right;

    public FRONTMIDDLEBACKQUEUE() {
        left = new ArrayDeque<>();
        right = new ArrayDeque<>();
    }
    
    private void balance() {
        if (left.size() > right.size() + 1) {
            right.offerFirst(left.pollLast());
        } else if (left.size() < right.size()) {
            left.offerLast(right.pollFirst());
        }
    }

    public void pushFront(int val) {
        left.offerFirst(val);
        balance();
    }

    public void pushMiddle(int val) {
        if (left.size() > right.size()) {
            right.offerFirst(left.pollLast());
        }
        left.offerLast(val);
    }

    public void pushBack(int val) {
        right.offerLast(val);
        balance();
    }

    public int popFront() {
        if (left.isEmpty() && right.isEmpty()) return -1;
        int val = left.isEmpty() ? right.pollFirst() : left.pollFirst();
        balance();
        return val;
    }

    public int popMiddle() {
        if (left.isEmpty() && right.isEmpty()) return -1;
        int val = left.pollLast();
        balance();
        return val;
    }

    public int popBack() {
        if (left.isEmpty() && right.isEmpty()) return -1;
        int val = right.isEmpty() ? left.pollLast() : right.pollLast();
        balance();
        return val;
    }


    public static void main(String[] args) {
        
        FRONTMIDDLEBACKQUEUE q = new FRONTMIDDLEBACKQUEUE();
        
        q.pushFront(1);
        q.pushBack(2);
        q.pushMiddle(3);
        q.pushMiddle(4);
        
        System.out.println(q.popFront());   // 1
        System.out.println(q.popMiddle());  // 3
        System.out.println(q.popMiddle());  // 4
        System.out.println(q.popBack());    // 2
        System.out.println(q.popFront());   // -1
    }
}
