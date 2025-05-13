public class Count_Primes {
    public int countPrimes(int n) {
        if(n<2)
            return 0;
        boolean a[]= new boolean [n];
        int count =0;
        for (int i=2;i<Math.sqrt(n);i++){

            if(!a[i]) {
                count++;
                for (int j = i * i; j < n; j += i)
                    a[j] = true;
            }
        }
        return count;
    }
}
