public class Majority_Element {
    public int majorityElement(int[] nums) {
        int count =1;
        int val=nums[0];
        for (int i=1;i<nums.length;i++){
            if(nums[i]==val)
                count++;
            else if (count>0)
                count--;
            else
            {
                count++;
                val=nums[i];

            }

        }
        return val;
    }
}
