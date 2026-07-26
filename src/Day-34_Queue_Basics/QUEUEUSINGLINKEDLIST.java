public class QUEUEUSINGLINKEDLIST {


    static class Node {

        int data;

        Node next;


        Node(int data){

            this.data=data;
        }
    }



    static class Queue {


        Node front;

        Node rear;



        void enqueue(int value){


            Node node = new Node(value);



            if(rear==null){

                front=rear=node;

                return;
            }



            rear.next=node;


            rear=node;
        }




        int dequeue(){


            if(front==null)

                return -1;



            int value=front.data;


            front=front.next;



            if(front==null)

                rear=null;


            return value;
        }



        void display(){


            Node temp=front;


            while(temp!=null){

                System.out.print(temp.data+" ");

                temp=temp.next;
            }
        }
    }



    public static void main(String[] args){


        Queue queue=new Queue();


        queue.enqueue(5);

        queue.enqueue(10);

        queue.enqueue(15);



        queue.display();


        System.out.println();


        System.out.println(queue.dequeue());

    }
}