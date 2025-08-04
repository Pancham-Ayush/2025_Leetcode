import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>>sl=new ArrayList<>();
    helper(candidates,target,0,new ArrayList<>(),sl,0);

        return sl;
    }
    void helper(int []c,int target, int cur,List<Integer>l,List<List<Integer>>sl,int index){
        if(cur==target){
            sl.add(new ArrayList<>(l));
            return;
        }
        if (cur>target)
            return;
        for (int x=index;x<c.length;x++){
            l.add(c[x]);
            cur+=c[x];
            helper(c,target,cur,l,sl,+1);
            cur-=c[x];
            l.remove(l.size()-1);
        }
    }
}
