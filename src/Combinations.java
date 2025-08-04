import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        HashSet < ArrayList<Integer>>h=new HashSet<>();
        List<List<Integer>>sl= new ArrayList<>();
        helper(1,n,k,new ArrayList<>(),sl);
        return sl;
    }
    void helper(int c,int n ,int k ,List<Integer>l,List<List<Integer>>sl){
        if(l.size()==k) {
            sl.add(new ArrayList<>(l));
            return;
        }
        for (int i=c;i<=n;i++){
            l.add(i);
            helper(i+1,n,k,l,sl);
            l.remove(l.size()-1);
        }
    }
}
