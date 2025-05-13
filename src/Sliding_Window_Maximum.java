import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Sliding_Window_Maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }
        if (k >= nums.length) {

            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return new int[]{max};
        }

        ArrayList<Integer>a =new ArrayList<>();
        Deque<Integer> d = new ArrayDeque<>();

        for (int i =0;i<nums.length;i++){
           while ( !d.isEmpty())
               if(d.getFirst()<nums[i])
                   d.pollFirst();
           d.add(nums[i]);
        }
        int[] result = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }
        return result;
    }

}
