import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>>l= new ArrayList<>();

        helper(nums,new int[nums.length],new ArrayList<>(),l);
        return l;
    }
    void helper(int num[], int arr[], ArrayList<Integer> a,List<List<Integer>>l){
        if(a.size()==num.length){
            l.add(new ArrayList<>(a));
            return;
        }
        for(int i=0;i<num.length;i++){
            if(arr[i]==0) {
                int t = num[i];
                a.add(t);
                arr[i]=1;
                helper(num, arr, a,l);
                arr[i]=0;
                a.remove(a.size()-1);
            }
        }
    }
}
