import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {

    List<Integer> l = new ArrayList<>();

    public List<Integer> inorderTraversal( TreeNode root) {

        if(root==null){
            return l;
        }
        helper(root);
        return l;
    }

    void helper(TreeNode root){
        if(root==null)
            return;

        helper(root.left);
        l.add(root.val);
        helper(root.right);

    }
}
