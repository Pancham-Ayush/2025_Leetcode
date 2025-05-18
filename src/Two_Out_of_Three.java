import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Two_Out_of_Three {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
    HashSet<Integer>h=new HashSet<>();
        for (int x :nums1)
            h.add(x);
        HashSet<Integer>h2=new HashSet<>();
        for (int x :nums2)
            h2.add(x);
        HashSet<Integer>h3=new HashSet<>();
        for (int x :nums3)
            h3.add(x);

        for (int x :h)
            hm.put(x,hm.getOrDefault(x,0)+1);
        for (int x :h2)
            hm.put(x,hm.getOrDefault(x,0)+1);
        for (int x :h3)
            hm.put(x,hm.getOrDefault(x,0)+1);

        for (int x:hm.keySet())
            if(hm.get(x)>1)
                l.add(x);

        return l;
    }
}
