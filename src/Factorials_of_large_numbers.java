import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factorials_of_large_numbers {

    List<Integer> list = new ArrayList<>(List.of(1));

     List<Integer> factorial (int n){

        for (int i =1;i<=n;i++){
            helper(i);
        }
        return list;
    }

    void helper(int n){

            int carry =0;
            for (int j =0;j<list.size();j++){
                int x = list.get(j);
                x = x*n+carry;
                carry= x/10;
                list.add(j,x%10);
            }
        while (carry > 0) {
            list.add(carry % 10);
            carry /= 10;
        }
        }
}
