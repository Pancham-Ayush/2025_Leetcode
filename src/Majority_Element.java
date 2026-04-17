public class Majority_Element {
    public int majorityElement(int[] nums) {
    int n = nums[0];
    int count =0;
    for(int i =0;i<nums.length;i++){
        if (n==nums[i]){
            count++;

        }
        else {
            if(count>0){
                count--;
            }
            else {
                n=nums[i];
                count++;
            }
        }
    }
        return n;

    }

}
