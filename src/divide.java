import java.math.BigInteger;

public class divide {
    public int divide(int dividend, int divisor) {

        BigInteger x= BigInteger.valueOf(dividend),y=BigInteger.valueOf(divisor);
        BigInteger z= x.divide(y);
        //biginteger compare to : if 1 data is less then right return 0 else 1
        if (z.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) >0) {
            return Integer.MAX_VALUE;
        }
        if (z.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        }

        return Integer.valueOf(String.valueOf(z));
    }
}
