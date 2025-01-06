import java.math.BigInteger;
import java.util.*;

public class best_Buy_Sell {
    static public int maxProfit(int[] prices) {
//        int best=0;
//
//        for(int i=0;i<prices.length;i++){
//             int  buy=prices[i];
//
//            for(int j =i;j<prices.length;j++){
//              if(best<prices[j]-buy){
//                  best=prices[j]-buy;
//              }
//            }
//        }
//        return best;

            int maxProfit = 0;
            int minPrice = Integer.MAX_VALUE;

            for (int price : prices) {
                minPrice = Math.min(minPrice, price);
                maxProfit = Math.max(maxProfit, price - minPrice);
            }

            return maxProfit;
        }


    public static void main(String[] args) {
        int d[]={7,1,5,3,6,4};
        System.out.println(maxProfit(d));

    }
}
