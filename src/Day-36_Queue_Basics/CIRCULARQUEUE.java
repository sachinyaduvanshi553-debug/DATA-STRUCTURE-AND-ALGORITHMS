public class CIRCULARQUEUE {

    static class MyCircularQueue {
        private int[] arr;
        private int front;
        private int rear;
        private int capacity;
        private int count;

        public MyCircularQueue(int k) {
            arr = new int[k];
            capacity = k;
            front = 0;
            rear = -1;
            count = 0;
        }

        // Process enqueue
        public boolean enQueue(int value) {
            if (isFull()) return false;
            rear = (rear + 1) % capacity;
            arr[rear] = value;
            count++;
            return true;
        }

        // Process dequeue
        public boolean deQueue() {
            if (isEmpty()) return false;
            front = (front + 1) % capacity;
            count--;
            return true;
        }

        public int Front() {
            if (isEmpty()) return -1;
            return arr[front];
        }

        public int Rear() {
            if (isEmpty()) return -1;
            return arr[rear];
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == capacity;
        }
    }


    public static void main(String[] args) {
        MyCircularQueue q = new MyCircularQueue(3);

        System.out.println(q.enQueue(1)); // true
        System.out.println(q.enQueue(2)); // true
        System.out.println(q.enQueue(3)); // true
        System.out.println(q.enQueue(4)); // false
        System.out.println(q.Rear());     // 3
        System.out.println(q.isFull());   // true
        System.out.println(q.deQueue());  // true
        System.out.println(q.enQueue(4)); // true
        System.out.println(q.Rear());     // 4
    }
}
