public class Minimum_Absolute_Difference_in_BST {

    Integer prev=null;
    Integer min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
return min;

    }
    void helper(TreeNode treeNode){
        if(treeNode==null)
            return;
        helper(treeNode.left);
        if(prev!=null)
        {
            min= Math.min(treeNode.val-prev,min);
        }
        prev=treeNode.val;
        helper(treeNode.left);
    }
}
