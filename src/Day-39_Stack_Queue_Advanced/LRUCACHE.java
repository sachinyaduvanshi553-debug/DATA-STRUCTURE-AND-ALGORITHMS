import java.util.HashMap;
import java.util.Map;

class DLLNode {
    int key;
    int value;
    DLLNode prev;
    DLLNode next;

    public DLLNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCACHE {

    private DLLNode head;
    private DLLNode tail;
    private int capacity;
    private Map<Integer, DLLNode> cache;

    public LRUCACHE(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        
        // Dummy head and tail
        head = new DLLNode(0, 0);
        tail = new DLLNode(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        
        // Return -1 if not found
        if (!cache.containsKey(key)) {
            return -1;
        }

        // Move to front (most recently used)
        DLLNode node = cache.get(key);
        removeNode(node);
        insertNode(node);
        
        return node.value;
    }

    public void put(int key, int value) {
        
        if (cache.containsKey(key)) {
            removeNode(cache.get(key));
        }

        // Evict least recently used if full
        if (cache.size() == capacity) {
            removeNode(tail.prev);
        }

        insertNode(new DLLNode(key, value));
    }


    private void removeNode(DLLNode node) {
        cache.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }


    private void insertNode(DLLNode node) {
        cache.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }


    public static void main(String[] args) {
        
        LRUCACHE lru = new LRUCACHE(2);
        
        lru.put(1, 1);
        lru.put(2, 2);
        
        System.out.println("Get 1: " + lru.get(1)); // 1
        
        lru.put(3, 3); // evicts 2
        
        System.out.println("Get 2: " + lru.get(2)); // -1
        
        lru.put(4, 4); // evicts 1
        
        System.out.println("Get 1: " + lru.get(1)); // -1
        System.out.println("Get 3: " + lru.get(3)); // 3
        System.out.println("Get 4: " + lru.get(4)); // 4
    }
}
