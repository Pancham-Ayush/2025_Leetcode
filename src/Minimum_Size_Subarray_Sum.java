import java.util.ArrayDeque;
import java.util.Deque;

public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0 ;
        int minlegth=Integer.MAX_VALUE;
        int end =0;
        int start=0;
        int n=nums.length;
        while (end<n){
            sum+=nums[end++];
            while (sum>=target){
                minlegth=Math.min(minlegth,end-start);
                sum-=nums[start++];
            }
        }
        return (minlegth!=0)?minlegth:0;
    }

}
