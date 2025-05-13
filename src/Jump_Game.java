public class Jump_Game {
    public boolean canJump(int[] nums) {
        int a=nums.length;
        return (a-1/nums[0]==0 )?true:false;
    }
}
