public class IMPLEMENTDEQUE {

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public IMPLEMENTDEQUE(int k) {
        capacity = k;
        arr = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        arr[front] = value;
        size++;
        return true;
    }

    public boolean insertRear(int value) {
        if (isFull()) return false;
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return true;
    }

    public boolean deleteRear() {
        if (isEmpty()) return false;
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }


    public static void main(String[] args) {
        
        IMPLEMENTDEQUE deque = new IMPLEMENTDEQUE(5);

        System.out.println(deque.insertFront(1)); // true
        System.out.println(deque.insertRear(2));  // true
        System.out.println(deque.getFront());     // 1
        System.out.println(deque.getRear());      // 2
        System.out.println(deque.deleteFront());  // true
        System.out.println(deque.insertRear(3));  // true
        System.out.println(deque.getFront());     // 2
    }
}
