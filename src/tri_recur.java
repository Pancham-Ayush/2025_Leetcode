import java.lang.reflect.Array;
import java.util.Arrays;

public class tri_recur {
    static int x=0;
    static void bubble(int ar[],int s,int end){
        if (end<=1)
            return;
        if (s<end-1) {

            if (ar[s] > ar[s + 1]) {
                int temp = ar[s];
                ar[s] = ar[s + 1];
                ar[s + 1] = temp;

            }
            bubble(ar, s + 1, end);
        }
        else {
            bubble(ar,0,end-1);
        }

    }

    public static void main(String[] args) {
       int a[]={3,5,1,2,33,0,-1};
       bubble(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
}
