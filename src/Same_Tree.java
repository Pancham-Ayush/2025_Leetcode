public class Same_Tree {
    public static boolean c = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
    c=true;
    helper(p,q);
        return c;
    }

    void helper(  TreeNode p,TreeNode q){
        if(p==null && q==null){

        }
        else if(p==null && q!=null || p!=null && q==null){
            c=false;
        }
        else if(p.val!=q.val){
            c=false;
        }
        else{
            helper(p.left,q.left);
            helper(p.right,q.right);

        }

    }
}
