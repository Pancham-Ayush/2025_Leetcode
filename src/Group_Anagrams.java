import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> h =new HashMap<>();
        for (String s: strs){
            char x []= s.toCharArray();
            Arrays.sort(x);
            String string =new String(x);
            if(!h.containsKey(string)) {
                ArrayList<String>a=new ArrayList<>();
                a.add(s);
                h.put(string,a);
            }
            else
                h.get(string).add(s);
        }

        return new ArrayList<>(h.values());
    }
}
