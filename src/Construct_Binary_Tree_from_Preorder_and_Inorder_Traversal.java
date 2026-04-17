import java.util.HashMap;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

    int[] preorder;
    int [] inorder;
    HashMap<Integer,Integer> map = new HashMap<>();
    int pre_idx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        this.inorder=inorder;
        this.preorder=preorder;
        for (int i =0;i<inorder.length;i++)
            map.put(inorder[i],i);
        pre_idx=0;
        return helper(0,inorder.length-1);


    }

    TreeNode helper(int l ,int r){
        if(l>r)
            return null;

        TreeNode node = new TreeNode();
        node.val= preorder[pre_idx];
        pre_idx++;
        int indx_in_inorder=map.get(node.val);
        node.left=helper(l,indx_in_inorder-1);
        node.right= helper(indx_in_inorder+1,r);

        return node;
    }
}