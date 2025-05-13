import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Finding_3_Digit_Even_Numbers {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> l= new ArrayList<>();
        for (int i=100;i<=998;i++) {
            int fre[]=new int[10];
            for (int j = 0; j < digits.length; j++)
                fre[digits[j]]++;
        int temp =i;
        boolean b =true;
        while (temp>0){
            int x=temp%10;
            if(fre[x]>0) {
                temp /= 10;
                fre[x]--;
            }
            else {
                b=false;
                break;
            }
        }
        if(b && i%2==0)
            l.add(i);
        }

        int[] result = new int[l.size()];
        for (int i1 = 0; i1 < l.size(); i1++) {
            result[i1] = l.get(i1);
        }
return result;
    }
}
