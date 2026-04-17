import java.util.HashMap;
import java.util.HashSet;

public class Same_Tree {
    public  boolean c = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        helper(p,q);
    return c;
    }

    void helper(TreeNode p,TreeNode q){
        if (p!=null && q==null || p==null && q!=null)
        {
            c=false;
            return;
        }
        if (p== null && q==null)
            return;
        if(p.val!=q.val) {
            c = false;
            return;
        }
        helper(p.left,q.left);
        helper(p.right,q.right);

    }

    public static void main(String[] args) {
        HashMap<Integer,Object> h = new HashMap<>();
       h.put(1, 2);
        System.out.println(h);


    }
}
