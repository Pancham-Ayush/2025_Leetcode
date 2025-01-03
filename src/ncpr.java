public class ncpr {
    static int factorial(int n){
        if(n==1|| n ==0)
            return 1;
        else
            return n*(factorial(n-1));
    }
static int ncr(int n,int r){
return factorial(n)/(factorial(r)*factorial(n-r));
}
    static int npr(int n,int r){
        return factorial(n)/factorial(n-r);
    }

    public static void main(String[] args) {
        System.out.println(ncr(1,2));
        System.out.println(npr(1,2));
    }
}
