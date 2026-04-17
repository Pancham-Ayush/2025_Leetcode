public class Sqrt_x {

    public int mySqrt(int x) {
        if(x==0)
            return 0;
        int left =1;
        int right = x;
        long mid=0;
        while (left<=right){
            mid = left+(right-left)/2;
            if((long)mid* mid==x)
                return (int) mid;
            if(mid*mid>x)
            {
                right=(int)mid-1;
            }
            else
                left=(int) mid+1;
        }
        return right;

    }

    public static void main(String[] args) {
        System.out.println(new Sqrt_x().mySqrt(4));
    }
}
