import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for (int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if (map.containsKey(t.charAt(i))){
                int x = map.get(t.charAt(i));
                if (x==1)
                    map.remove(t.charAt(i));
                else {
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                }
            }
            else
                map.put(t.charAt(i),-1);
        }
       for (Integer x: map.values()){
           if (x!=0)
               return false;
       }
        return true;
    }
}
