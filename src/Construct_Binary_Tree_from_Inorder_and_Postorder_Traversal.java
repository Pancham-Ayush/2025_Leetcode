import java.util.HashMap;
import java.util.Stack;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {

    int pos;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        for (int i =0;i<inorder.length;i++)
            map.put(inorder[i],i);
        pos = postorder.length-1;
        return helper(inorder,postorder,0,inorder.length-1);
    }
    TreeNode helper(int[] inorder, int[] postorder,int l , int r){
        if(l>r && pos>0)
            return null;
        TreeNode node = new TreeNode(postorder[pos]);
        int p = map.get(node.val);
        pos--;
        node.left=helper(inorder,postorder,l,p-1);
        node.right=helper(inorder,postorder,p+1,r);
        return node;
    }


}
