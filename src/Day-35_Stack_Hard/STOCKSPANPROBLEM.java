import java.util.Stack;
import java.util.Arrays;

class StockSpanner {
    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        
        // Pop while top price is less than or equal to current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        
        stack.push(new int[]{price, span});
        return span;
    }
}

public class STOCKSPANPROBLEM {

    public static void main(String[] args) {

        StockSpanner spanner = new StockSpanner();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.print("Spans: ");
        for (int price : prices) {
            System.out.print(spanner.next(price) + " ");
        }
        System.out.println();
    }
}
