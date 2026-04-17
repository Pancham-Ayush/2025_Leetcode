public class Jump_Game {
    public boolean canJump(int[] nums) {
        int p =0;
        for(int i=0;i<nums.length;i++){
            if (i==nums.length-1 )
                return true;
            if (p==i){
                if (nums[i]==0)
                    return false;
                p+=nums[i];
                if (p>nums.length)
                    return false;
            }
        }
        return p==nums.length-1;
    }
}
