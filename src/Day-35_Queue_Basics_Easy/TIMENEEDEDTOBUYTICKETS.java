import java.util.LinkedList;
import java.util.Queue;

public class TIMENEEDEDTOBUYTICKETS {


    static int timeRequiredToBuy(int[] tickets, int k) {


        Queue<Integer> queue = new LinkedList<>();


        // Store person indexes

        for(int i = 0; i < tickets.length; i++) {

            queue.add(i);
        }



        int time = 0;



        while(true) {


            int person = queue.remove();



            tickets[person]--;


            time++;



            // Target person completed buying

            if(person == k && tickets[person] == 0) {

                break;
            }



            // Add person again if tickets remain

            if(tickets[person] > 0) {

                queue.add(person);
            }
        }



        return time;
    }





    public static void main(String[] args) {



        int[] tickets = {2,3,2};


        int k = 2;



        int result =
                timeRequiredToBuy(tickets,k);



        System.out.println(
                "Time Required: "
                        + result
        );

    }
}