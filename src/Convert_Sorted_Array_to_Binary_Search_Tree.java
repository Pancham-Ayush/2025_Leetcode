public class Convert_Sorted_Array_to_Binary_Search_Tree {

    public TreeNode sortedArrayToBST(int[] nums) {

        return helper(nums,0,nums.length-1);
    }
    TreeNode helper(int []nums,int s,int e){
        if (s>e)
            return null;
        TreeNode node = new TreeNode();
        int n = s+(e-s)/2;
        node.val=nums[n];
        node.left= helper(nums,s,n-1);
        node.right= helper(nums,n+1,e);
        return node;
    }
}
