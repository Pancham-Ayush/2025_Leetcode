import java.util.*;

public class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h =new HashMap<>();
        for (int x :nums)
        {
            h.put(x, h.getOrDefault(x, 0) + 1);
        }
        ArrayList<Map.Entry<Integer,Integer>> a = new ArrayList<>(h.entrySet());
        a.sort(Map.Entry.comparingByValue());
        Collections.reverse(a);
        int ar[]=new int[k];
        for (int i =0;i<k;i++)
            ar[i]=(a.get(i).getKey());
        return ar;
    }
}
