public class Symmetric_Tree {
    public static boolean b=true;
    public boolean isSymmetric(TreeNode root) {
    b=true;
    helper(root.left,root.right);
    return b;
    }
    void helper(TreeNode p, TreeNode q){
        if(p==null && q==null)
        {

        }
        else if(p==null && q!=null || p!=null && q==null){
            b=false;
        }
        else if(p.val!=q.val){
            b=false;
        }
        else
        {
            helper(p.left,q.right);
            helper(p.right,q.left);
        }
    }
}
