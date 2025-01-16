import java.util.ArrayList;
import java.util.List;

public class Lexosort {
    public List<Integer> lexicalOrder(int n) {
List<String> l = new ArrayList<>();
        for (int i=1;i<n;i++){
            l.add(String.valueOf(i));
        }
        l.sort(null);
        List<Integer> r=new ArrayList<>();
        for (String x: l)
            r.add(Integer.parseInt(x));
        return r;
    }
}
