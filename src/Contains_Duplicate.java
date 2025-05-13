import java.util.HashSet;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for (int x:nums){
            if(!h.add(x))
                return true;

        }
        return false;
    }
}
