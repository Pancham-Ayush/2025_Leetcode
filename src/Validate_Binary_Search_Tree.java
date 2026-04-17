public class Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
       return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }
    boolean helper(TreeNode root,long min,long max){
        if(root==null)
            return  true;

        if (root.val<=min || root.val>=max)
            return false;
new Validate_Binary_Search_Tree().notify();
       return helper(root.left,min,root.val) && helper(root.right,root.val,max);

    }
}
