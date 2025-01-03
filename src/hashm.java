import java.util.HashMap;
import java.util.Scanner;

public class hashm {
   static boolean anagram(String str1,String str2) {
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();
        HashMap<Character, Integer> h = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        if (a.length != b.length)
            return false;
        else {
            int l =a.length;
         for(int i =0;i< l;i++ ) {
             h.put(a[i], h.getOrDefault(a[i], 0) + 1);
             h2.put(b[i], h2.getOrDefault(b[i], 0) + 1);
         }
         if(h.equals(h2))
            return true;
         else
             return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2= sc.next();
        System.out.println((anagram(s1,s2)?"annagram":"not anagram"));

    }
}
