public class uglyno {
    public boolean isUgly(int n) {
        if(n == 0) return false;
        if(n > 0 && n <=3) return true;
        if(n%2==0) return isUgly(n/2);
        if (n <= 0) {
            return false;  // Negative numbers and zero are not ugly numbers.
        }

        // Continuously divide n by 2, 3, and 5
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        // If n becomes 1, it is an ugly number
        return n == 1;
    }

}
