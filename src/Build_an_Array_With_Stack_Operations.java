import java.util.ArrayList;
import java.util.List;

public class Build_an_Array_With_Stack_Operations {
    public List<String> buildArray(int[] target, int n) {
        var list = new ArrayList<String>();
        int j=0;
        for (int i =1;i<=n && target.length<i;i++){

        if(target[j]==i ){
            list.add("Push");
            j++;
        }
        else
        {
            list.add("Push");
            list.add("Pop");
        }
        }
        return list;
    }
}
