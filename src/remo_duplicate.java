import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class remo_duplicate {

    static public int removeDuplicates(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();

        for (int num : nums) {
            if (h.add(num)) {
                l.add(num);
            }
        }

        for (int i = 0; i < l.size(); i++) {
            nums[i] = l.get(i);
        }

        return l.size();
    }
    public static void main(String[] args) {
       int a[]={1,2,2,2,33,1,3};
        System.out.println(removeDuplicates(a));
    }
}
