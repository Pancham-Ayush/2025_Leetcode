import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        help(nums,0,new ArrayList<>(),res);
        return res;
    }
    void help(int nums[], int index, List<Integer> a, List<List<Integer>>res){
        if(index==nums.length)
        {
            res.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[index]);
        help(nums,index+1,a,res);
        a.remove(a.size()-1);
        help(nums,index+1,a,res);
    }
}
