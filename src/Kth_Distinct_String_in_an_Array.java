import java.util.HashMap;
import java.util.LinkedHashMap;

public class Kth_Distinct_String_in_an_Array {
    public String kthDistinct(String[] arr, int k) {
        int c=0;
        HashMap<String,Integer>h =new LinkedHashMap<>();
        for (String x: arr)
        {
            if(!h.containsKey(x))
                h.put(x,1);
            else
                h.put(x,h.get(x)+1);
        }
        for (String x:h.keySet())
        {
            if(h.get(x)==1)
                c++;
            if(c==k)
                return x;
        }
        return "";

    }
}
