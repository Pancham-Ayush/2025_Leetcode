import java.util.*;

public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> r = new ArrayList<>();
    helper(0,0,n,new StringBuilder(),  r);
    return r;
    }

    void helper(int open ,int close ,int n ,StringBuilder s, ArrayList<String> r){

        if(s.length()==n*2)
            r.add(s.toString());
        if(open<n)
        {
            s.append('(');
            helper(open+1,close,n,s,r);
            s.deleteCharAt(s.length()-1);
        }
        if (close<open)
        {
            s.append(')');
            helper(open,close+1,n,s,r);
            s.deleteCharAt(s.length()-1);
        }
    }
}
