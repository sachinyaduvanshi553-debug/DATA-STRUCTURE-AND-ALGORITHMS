import java.util.Stack;

public class FINALPRICESDISCOUNT {


    static int[] finalPrices(int[] prices) {


        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < prices.length; i++) {



            while (!stack.isEmpty()
                    && prices[stack.peek()] >= prices[i]) {


                int index = stack.pop();


                prices[index] = prices[index] - prices[i];
            }



            stack.push(i);
        }


        return prices;
    }



    static void print(int[] arr) {


        for (int value : arr) {

            System.out.print(value + " ");
        }


        System.out.println();
    }



    public static void main(String[] args) {


        int[] prices = {8,4,6,2,3};


        System.out.println("Original Prices:");

        print(prices);


        int[] result = finalPrices(prices);


        System.out.println("Final Prices:");

        print(result);
    }
}