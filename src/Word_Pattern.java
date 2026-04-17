import java.util.HashMap;
import java.util.LinkedList;

public class Word_Pattern {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character ,String> h_pattern = new HashMap<>();
        HashMap<String,Character > h_s= new HashMap<>();

        int i =0;
        String a[]= s.split(" ");
        if (a.length!=pattern.length())
            return false;
        for (String x :a) {
           if (i>pattern.length())
               return false;
           char c = pattern.charAt(i);

           if(!h_pattern.containsKey(c)){

               if(h_s.containsKey(x)){
                   return false;
               }
               h_pattern.put(c,x);
               h_s.put(x,c);
           }
           else {
               String t = h_pattern.get(c);
               if (t!=null)
                   if(!t.equals(x))
                       return false;
           }
           i++;
        }
        return true;

    }

}
