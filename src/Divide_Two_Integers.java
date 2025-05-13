public class Divide_Two_Integers {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
        boolean sign = (dividend>=0)==(divisor>=0)?true:false;
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        int ans =0;
        while (dividend>=divisor){
            int count =0;
            while (dividend >=(divisor<<count)){
                count++;
            }
            count--;
            dividend-=divisor<<count;
            ans+=1<<count;
        }
        return (sign)?ans:-ans;

    }

    public static void main(String[] args) {
        System.out.println(new Divide_Two_Integers().divide(56,5));
    }
}
