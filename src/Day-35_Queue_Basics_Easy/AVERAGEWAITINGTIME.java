public class AVERAGEWAITINGTIME {


    static double averageWaitingTime(int[][] customers) {


        double totalWaiting = 0;


        int currentTime = 0;



        for(int[] customer : customers){


            int arrivalTime = customer[0];


            int cookingTime = customer[1];



            if(currentTime < arrivalTime){


                currentTime = arrivalTime;
            }



            currentTime += cookingTime;



            totalWaiting += currentTime - arrivalTime;

        }



        return totalWaiting / customers.length;

    }





    public static void main(String[] args) {



        int[][] customers = {


                {1,2},

                {2,5},

                {4,3}

        };



        double result =
                averageWaitingTime(customers);



        System.out.println(
                "Average Waiting Time: "
                        + result
        );

    }
}