public class Flatten_Binary_Tree_to_Linked_List {
    TreeNode tail;
    public void flatten(TreeNode root) {
        TreeNode temp=new TreeNode(0);
        tail=temp;
        helper(root);
    }
    void  helper(TreeNode cur){
        if(cur==null) return;
        tail.right=cur;
        tail.left=null;
        tail=cur;
        TreeNode left=cur.left;
        TreeNode right=cur.right;
        tail.left=null;
        cur.left=null;
        helper(left);
        helper(right);

    }
}
