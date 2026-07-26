public class IMPLEMENTQUEUEUSINGARRAYS {

    static class Queue {
        private int[] arr;
        private int front;
        private int rear;
        private int capacity;
        private int count;

        public Queue(int size) {
            arr = new int[size];
            capacity = size;
            front = 0;
            rear = -1;
            count = 0;
        }

        // Process enqueue
        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = item;
            count++;
        }

        // Process dequeue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int item = arr[front];
            front = (front + 1) % capacity;
            count--;
            return item;
        }

        public int front() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == capacity;
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front: " + q.front()); // 1
        System.out.println("Dequeue: " + q.dequeue()); // 1
        System.out.println("Front: " + q.front()); // 2
        System.out.println("Is Empty: " + q.isEmpty()); // false
    }
}
