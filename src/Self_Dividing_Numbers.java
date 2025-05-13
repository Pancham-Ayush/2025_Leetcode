import java.util.ArrayList;
import java.util.List;

public class Self_Dividing_Numbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>l =new ArrayList<>();
        for (int i=left;i<=right;i++){
            int x=i;
            int pos=0;
            boolean b=true;
            while (x>0){
                int y =x%10;
                if(y!=0 && i%y==0){
                    x=x/10;
                }
                else {
                    b=false;
                    break;
                }
            }
            if(b)
                l.add(i);
        }

        return l;
    }
}
