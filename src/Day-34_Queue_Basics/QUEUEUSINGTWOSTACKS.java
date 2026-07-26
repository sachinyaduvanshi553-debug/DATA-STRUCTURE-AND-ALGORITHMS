import java.util.Stack;

public class QUEUEUSINGTWOSTACKS {


    static class Queue {


        Stack<Integer> s1=new Stack<>();

        Stack<Integer> s2=new Stack<>();



        void enqueue(int value){

            s1.push(value);
        }



        int dequeue(){


            if(s2.isEmpty()){


                while(!s1.isEmpty()){

                    s2.push(s1.pop());
                }
            }


            return s2.pop();
        }
    }



    public static void main(String[] args){


        Queue queue=new Queue();


        queue.enqueue(10);

        queue.enqueue(20);

        queue.enqueue(30);



        System.out.println(queue.dequeue());

    }
}