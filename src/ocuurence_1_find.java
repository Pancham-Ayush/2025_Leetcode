import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ocuurence_1_find {

       static public int[] singleNumber(int[] nums) {
            int arr[]= new int[2];
            HashSet<Integer> hashSet = new HashSet<>();
            for (int x :nums){
                if(!hashSet.add(x)){
                   hashSet.remove(x);
                }
            }
           Iterator<Integer> i = hashSet.iterator();
            arr[0]=i.next();
            arr[1]=i.next();
            return arr;
        }

    public static void main(String[] args) {
        int a[]={1,2,2,3,3,5};
        System.out.println(singleNumber(a));
    }
}
