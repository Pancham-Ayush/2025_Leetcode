import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class sumArray_list {
    public List<Integer> addToArrayForm(int[] num, int k) {
//   int i =num.length-1;
//    List <Integer > l = new ArrayList<>();
//    int cary =0;
//    while (i>=0){
//        int n =i>=0?num[i]:0;
//        int sum = n+cary+k%10;
//        cary=sum/10;
//        sum=sum%10;
//        l.add(0,sum);
//
//        k/=10;
//        i--;
//    }
//    return l;
        LinkedList<Integer> result = new LinkedList<>();
        int n = num.length;
        int carry =k;

        for(int i=n-1;i>=0;i--){
            carry+= num[i];
            result.addFirst(carry%10);
            carry/=10;
        }

        while(carry>0){
            result.addFirst(carry%10);
            carry/=10;
        }
        return result;
    }
}
