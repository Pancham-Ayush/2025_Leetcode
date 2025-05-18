public class rotate_array {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
        } else {
            helper(nums, 0,nums.length-1 );
            helper(nums,0,k-1);
            helper(nums,k,nums.length-1);

        }

    }  void helper ( int arr[], int left, int right){
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}