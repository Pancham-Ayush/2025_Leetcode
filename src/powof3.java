public class powof3 {
   static public boolean isPowerOfThree(int n) {
        if(n<=0||n==Integer.MAX_VALUE){
            return false;
        }
       double x =  (Math.log(n)/Math.log(3));
       int d =(int)Math.ceil(x);
       System.out.println(d);
       return (int)Math.pow(3,d)==n;

    }
    public static void main(String[] args) {

        int x=2147483647;

        System.out.println(isPowerOfThree(x));
    }
    }
