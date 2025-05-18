import java.util.ArrayList;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        ArrayList<Integer> a= new ArrayList<>();
        for (int x:nums1)
            h.add(x);
        for (int x: nums2)
            if(h.contains(x))
                h2.add(x);
        int ans[]= new int[h2.size()];
        int  i=0;
        for (int x: h2)
            ans[i++]=x;
        return ans;
        }
}
