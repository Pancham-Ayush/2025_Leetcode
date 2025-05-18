import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ind_All_Lonely_Numbers_in_the_Array {
    public List<Integer> findLonely(int[] nums) {
        List<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap();
        for (int x:nums)
        {
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for (int x: h.keySet())
        {
            if(h.get(x)==1 && !h.containsKey(x-1) && !h.containsKey(x+1))
                l.add(x);
        }



        return l;
    }
}
