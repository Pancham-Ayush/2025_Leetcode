public class Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int ans[]= new int[2*nums.length];
        int n = nums.length;
        for(int i=0;i<n;i++)
            ans[i] = nums[i];
        for(int i=n;i<2*n;i++)
            ans[i] = nums[i];
        return ans;
    }
}
