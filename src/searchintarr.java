public class searchintarr {
    public int searchInsert(int[] nums, int target) {

        int pos =0;
        for(int i =0;i<nums.length;i++) {
            if (nums[i] == target)
                return i;
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
