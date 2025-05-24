public class Max_Consecutive_Ones_III {
    public int longestOnes(int[] nums, int k) {
        int max=0,cur=0;
        int temp =k;
        int f=-1;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cur++;
                max=Math.max(max,cur-i);
            }
            else if(temp>0){
                if(f==-1){
                    f=i;
                }
                temp--;
                cur++;
                max=Math.max(max,cur-i);
            }
            else {
                cur=0;
                temp=k;
                i=f;
            }
        }
        return max;
    }
}
