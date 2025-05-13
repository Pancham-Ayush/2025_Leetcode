import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        int left=0;
        int right =0;
        int n =s.length();
        HashSet<Character> h=new HashSet<>();
        while (right<n){
            if(!h.contains(s.charAt(right))) {
                h.add(s.charAt(right));
                right++;
                max=Math.max(max,right-left);
            }
            else
            {
                h.remove(s.charAt(left));
                left++;
            }

        }
        return max;
    }
}
