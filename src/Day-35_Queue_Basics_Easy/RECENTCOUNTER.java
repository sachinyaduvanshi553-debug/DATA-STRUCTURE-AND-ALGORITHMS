import java.util.LinkedList;
import java.util.Queue;

public class RECENTCOUNTER {


    static class RecentCounter {


        Queue<Integer> queue;



        RecentCounter() {


            queue = new LinkedList<>();

        }




        int ping(int t) {



            queue.add(t);



            while(queue.peek() < t - 3000) {


                queue.remove();

            }



            return queue.size();

        }

    }





    public static void main(String[] args) {



        RecentCounter counter =
                new RecentCounter();



        System.out.println(counter.ping(1));


        System.out.println(counter.ping(100));


        System.out.println(counter.ping(3001));


        System.out.println(counter.ping(3002));

    }
}