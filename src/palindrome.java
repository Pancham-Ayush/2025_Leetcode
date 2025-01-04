import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class palindrome {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        String s=String.valueOf(x);
        char[] a= s.toCharArray();
        ArrayList<Character> l = new ArrayList<>();
        for(char t :a){
            l.add(t);
        }
        for(int i = 0 , j=l.size()-1; i<l.size()&&j>=0;i++,j++){
            if(l.get(i)!=l.get(j))
                return false;
        }

       return true;
    }

}
