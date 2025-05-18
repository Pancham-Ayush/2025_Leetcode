import java.util.Arrays;


public class Sum3_Closest {
    public int threeSumClosest(int[] nums, int target) {

        int closest=nums[0]+nums[1]+nums[2];
        int mindif=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right=nums.length-1;
        while (left<right)
        {
            int sum=nums[left]+nums[right]+nums[i];

            if(sum==target)
                return sum;
            if(sum<target)
                left++;
            else
                right--;
            if(Math.abs(sum-target)<mindif)
            {
                closest=sum;
                mindif=Math.abs(sum-target);
            }
        }

        }
        return closest;
    }
}
