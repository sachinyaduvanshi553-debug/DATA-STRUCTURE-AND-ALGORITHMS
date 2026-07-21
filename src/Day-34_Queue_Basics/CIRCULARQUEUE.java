public class CIRCULARQUEUE {


    static class Queue {


        int[] arr;

        int front;

        int rear;

        int size;


        Queue(int capacity){

            arr = new int[capacity];

            front = 0;

            rear = -1;

            size = 0;
        }



        void enqueue(int value){


            if(size == arr.length){

                System.out.println("Full Queue");

                return;
            }


            rear = (rear + 1) % arr.length;


            arr[rear] = value;


            size++;
        }




        int dequeue(){


            if(size == 0)
                return -1;


            int value = arr[front];


            front = (front + 1) % arr.length;


            size--;


            return value;
        }



        void display(){


            for(int i=0;i<size;i++){

                System.out.print(arr[(front+i)%arr.length]+" ");
            }

            System.out.println();
        }
    }



    public static void main(String[] args){


        Queue queue = new Queue(5);


        queue.enqueue(1);

        queue.enqueue(2);

        queue.enqueue(3);


        queue.dequeue();


        queue.enqueue(4);


        queue.display();

    }
}