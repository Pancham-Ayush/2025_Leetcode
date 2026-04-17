public class Rotate_Array
{

//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k = k % n;
//        if (k == 0)
//            return;
//        for (int j = 0; j < k; j++) {
//            Integer prev = null;
//            for (int i = 0; i < n; i++) {
//                int x = (i + 1) % n;
//                if (prev == null) {
//                    prev = nums[x];
//                    nums[x] = nums[i];
//                } else {
//                    int temp = nums[x];
//                    nums[x] = prev;
//                    prev = temp;
//                }
//
//            }
//        }
//    }
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        if (k ==0)
            return;
        helper(nums,0,nums.length-1);
        helper(nums,0,k-1);
        helper(nums,k,nums.length);
    }
    void helper(int num[],int l,int h){
        while (l<h){
            int temp = num[l];
            num[l]=num[h];
            num[h]=temp;
            l++;
            h--;
        }
    }
}
