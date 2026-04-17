import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
    int sum =0;
    int index =0;
    for (List x : triangle)
    {
        int size = x.size();
        if(index+1<size){
            int s1 = (int) x.get(index);
            int s2 = (int) x.get(index+1);
            if (s1<s2){
                sum+=s1;
            }
            else {
                index++;
                sum+=s2;
            }
        }
        else
            sum=sum+(int)x.get(index);
    }
    return sum;
    }
}
