public class Path_Sum {
    boolean x=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {

        helper(root,targetSum,0);
        return x;
    }
    void helper(TreeNode treeNode, int target , int val){
        if(treeNode==null)
            return ;
        val+=treeNode.val;
        if(val==target && treeNode.right== null && treeNode.left==null)
        {
            x=true;
            return;
        }
        helper(treeNode.left,target,val);
        helper(treeNode.right,target,val);

    }
}
