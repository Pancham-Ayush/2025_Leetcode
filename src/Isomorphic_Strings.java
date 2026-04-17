import java.util.HashMap;

public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {


        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();

        for( int i =0;i<s.length();i++){
            char x = s.charAt(i);
            char y =t.charAt(i);
            if (map.containsKey(x)){

                char temp =map.get(x);
                if (temp==y)
                    continue;
                else
                    return false;
            }
            else {
                if(!map2.containsKey(y)) {
                    map.put(x, y);
                    map2.put(y, x);

                }
                else
                    return false;
            }
        }
        return true;
    }
}
