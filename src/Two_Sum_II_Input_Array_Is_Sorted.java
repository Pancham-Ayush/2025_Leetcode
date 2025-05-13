import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int ar[]= new  int[2];
        for (int i=0;i<numbers.length;i++){
            if(!h.containsKey(target-numbers[i]))
                h.put(numbers[i],i);
            else
            {
                ar[0]=i+1;
                ar[1]=h.get(target-numbers[i])+1;
                break;

            }

        }
        Arrays.sort(ar);
        return ar;

    }
}
