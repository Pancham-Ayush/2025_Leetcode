import java.util.Stack;

public class Longest_Valid_Parentheses {
    public int longestValidParentheses(String s) {
        int count =0;
        int i =0;
        int left = 0;
        int right = 0;
        for (;i<s.length();i++){
            if(s.charAt(i)=='(')
                left++;
            else
                right++;
            if(left==right)
            {
                count=Math.max(count,left*2);
            }
            else if(right>left)
            {
                right=0;
                left=0;
            }
        }
        i=s.length()-1;
        left=right=0;
        for (;i>=0;i++){
            if(s.charAt(i)=='(')
                left++;
            else
                right++;
            if(left==right)
            {
                count=Math.max(count,left*2);
            }
            else if(right<left)
            {
                right=0;
                left=0;
            }
        }
        return count;
    }
}
