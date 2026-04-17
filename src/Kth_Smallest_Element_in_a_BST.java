public class Kth_Smallest_Element_in_a_BST {
    int pointer;
    int res;
    public int kthSmallest(TreeNode root, int k) {
        pointer=0;
        helper(root,k);
        return res;
    }
    void helper(TreeNode treeNode,int k){

        if(treeNode==null)
            return;
        if(pointer>k)
            return;

        helper(treeNode.left,k);
        pointer++;
        if (pointer==k)
        {
            res=treeNode.val;
            return;
        }
        helper(treeNode.right,k);

    }
}
