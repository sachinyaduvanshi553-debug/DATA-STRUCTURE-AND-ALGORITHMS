public class DESIGNCIRCULARQUEUE {


    static class MyCircularQueue {


        int[] queue;

        int front;

        int rear;

        int size;

        int capacity;



        MyCircularQueue(int k) {


            capacity = k;

            queue = new int[k];

            front = 0;

            rear = -1;

            size = 0;
        }



        boolean enQueue(int value) {


            if (isFull()) {

                return false;
            }


            rear = (rear + 1) % capacity;


            queue[rear] = value;


            size++;


            return true;
        }




        boolean deQueue() {


            if (isEmpty()) {

                return false;
            }


            front = (front + 1) % capacity;


            size--;


            return true;
        }




        int Front() {


            if (isEmpty()) {

                return -1;
            }


            return queue[front];
        }




        int Rear() {


            if (isEmpty()) {

                return -1;
            }


            return queue[rear];
        }




        boolean isEmpty() {


            return size == 0;
        }





        boolean isFull() {


            return size == capacity;
        }




        void display() {


            if(isEmpty()){

                System.out.println("Queue is Empty");

                return;
            }



            for(int i=0;i<size;i++){


                System.out.print(
                        queue[(front+i)%capacity] + " "
                );
            }


            System.out.println();
        }

    }




    public static void main(String[] args) {


        MyCircularQueue queue = new MyCircularQueue(3);



        System.out.println(queue.enQueue(10));

        System.out.println(queue.enQueue(20));

        System.out.println(queue.enQueue(30));



        queue.display();



        System.out.println("Front: "
                + queue.Front());


        System.out.println("Rear: "
                + queue.Rear());



        queue.deQueue();



        queue.display();



        System.out.println(queue.enQueue(40));


        queue.display();

    }
}