public class QUEUEUSINGARRAY {


    static class Queue {


        int[] arr;

        int front;

        int rear;

        int size;



        Queue(int capacity) {

            arr = new int[capacity];

            front = 0;

            rear = -1;

            size = 0;
        }



        void enqueue(int value) {


            if (size == arr.length) {

                System.out.println("Queue Overflow");

                return;
            }


            rear++;

            arr[rear] = value;

            size++;
        }



        int dequeue() {


            if (isEmpty()) {

                System.out.println("Queue Underflow");

                return -1;
            }


            int value = arr[front];

            front++;

            size--;


            return value;
        }



        int peek() {


            if (isEmpty())
                return -1;


            return arr[front];
        }



        boolean isEmpty() {

            return size == 0;
        }



        void display() {


            if (isEmpty()) {

                System.out.println("Queue Empty");

                return;
            }


            for(int i = front; i <= rear; i++) {

                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }



    public static void main(String[] args) {


        Queue queue = new Queue(5);



        queue.enqueue(10);

        queue.enqueue(20);

        queue.enqueue(30);



        System.out.println("Queue:");

        queue.display();



        System.out.println("Removed:");

        System.out.println(queue.dequeue());



        System.out.println("Front:");

        System.out.println(queue.peek());

    }
}