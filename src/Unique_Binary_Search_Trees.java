public class Unique_Binary_Search_Trees {
     int arr[];
    public int numTrees(int n) {
        arr=new int[n+1];
        if(n==0|| n==1)
            return 1;
        arr[0]=1;
        arr[1]=1;
        int res =0;
        for(int i =0;i<n;i++){
            res+=helper(i)*helper(n-i-1);
        }
return helper(n);
    }
    int helper(int n ){

        if(n==1 || n ==0)
            return 1;

        if(arr[n]!=0)
            return arr[n];
        int res=0;
        for(int i =0;i<n;i++){
            res +=helper(i)*helper(n-i-1);
        }
        arr[n]=res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Unique_Binary_Search_Trees().helper(3));
    }
}
