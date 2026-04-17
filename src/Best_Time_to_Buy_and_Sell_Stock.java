import java.util.Stack;

public class Best_Time_to_Buy_and_Sell_Stock {

    public int maxProfit(int[] prices) {

        int min = Integer.MIN_VALUE,max=0;
        for (int x : prices){
            if(x<min){
                x = min;
            }
            max = Math.max(max,x-min);
        }
        return max;
    }

}
