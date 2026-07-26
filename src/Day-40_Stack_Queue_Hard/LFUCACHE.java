import java.util.HashMap;

class Node {
    int key, val, freq;
    Node prev, next;

    Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.freq = 1;
    }
}

class DoublyLinkedList {
    int size;
    Node head, tail;

    DoublyLinkedList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    void addNode(Node node) {
        Node next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;
        size++;
    }

    void removeNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
        size--;
    }

    Node removeTail() {
        if (size > 0) {
            Node node = tail.prev;
            removeNode(node);
            return node;
        }
        return null;
    }
}

public class LFUCACHE {
    static int capacity;
    static int minFreq;
    static HashMap<Integer, Node> keyNodeMap;
    static HashMap<Integer, DoublyLinkedList> freqListMap;

    static void init(int cap) {
        capacity = cap;
        minFreq = 0;
        keyNodeMap = new HashMap<>();
        freqListMap = new HashMap<>();
    }

    static int get(int key) {
        if (capacity == 0 || !keyNodeMap.containsKey(key)) {
            return -1;
        }

        Node node = keyNodeMap.get(key);
        updateFreq(node);
        return node.val;
    }

    static void put(int key, int value) {
        if (capacity == 0) return;

        if (keyNodeMap.containsKey(key)) {
            Node node = keyNodeMap.get(key);
            node.val = value;
            updateFreq(node);
        } else {
            if (keyNodeMap.size() == capacity) {
                DoublyLinkedList minFreqList = freqListMap.get(minFreq);
                Node evictedNode = minFreqList.removeTail();
                keyNodeMap.remove(evictedNode.key);
            }

            Node newNode = new Node(key, value);
            keyNodeMap.put(key, newNode);
            minFreq = 1;
            DoublyLinkedList list = freqListMap.getOrDefault(1, new DoublyLinkedList());
            list.addNode(newNode);
            freqListMap.put(1, list);
        }
    }

    static void updateFreq(Node node) {
        int freq = node.freq;
        DoublyLinkedList list = freqListMap.get(freq);
        list.removeNode(node);

        if (freq == minFreq && list.size == 0) {
            minFreq++;
        }

        node.freq++;
        DoublyLinkedList newList = freqListMap.getOrDefault(node.freq, new DoublyLinkedList());
        newList.addNode(node);
        freqListMap.put(node.freq, newList);
    }

    public static void main(String[] args) {
        init(2);
        put(1, 1);
        put(2, 2);
        System.out.println(get(1)); // 1
        put(3, 3);
        System.out.println(get(2)); // -1
        System.out.println(get(3)); // 3
        put(4, 4);
        System.out.println(get(1)); // -1
        System.out.println(get(3)); // 3
        System.out.println(get(4)); // 4
    }
}
