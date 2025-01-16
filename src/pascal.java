import java.util.ArrayList;
import java.util.List;

public class pascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> l2=new ArrayList<>();
            for (int j=0;j<=i;j++){
                if(j==0||j==i)
                    l2.add(0);
                else {
                    int val =l.get(i-1).get(j-1)+l.get(i-1).get(j);
                    l2.add(val);
                }

            }
            l.add(l2);
            l2=null;
        }
        return l;
    }
}
