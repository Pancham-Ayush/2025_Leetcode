public class Remove_occourance_in_array {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Index for elements not equal to val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Overwrite elements at the beginning of the array
                k++;
            }
        }
        return k; // Return the number of elements not equal to val
    }
}
