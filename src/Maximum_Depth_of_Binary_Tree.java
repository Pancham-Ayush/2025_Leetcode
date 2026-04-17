public class Maximum_Depth_of_Binary_Tree {
    int max =0;
    public int maxDepth(TreeNode root) {

        int mx =0;
        if(root==null)
            return 0;
        helper(root,1);
        return max;

    }
    void helper(TreeNode root,int l){
            max=Math.max(max,l);
        if(root.left!=null)
            helper(root.left,l+1);
        if (root.right!=null)
            helper(root.right,l+1);
    }
}
