public class Flatten_Binary_Tree_to_Linked_List {

    TreeNode temp;
    public void flatten(TreeNode root) {
        temp= new TreeNode();
        helper(root);
    }
    void helper(TreeNode root){
        if(root==null)
            return;

        TreeNode left = root.left;
        TreeNode right = root.right;
        temp=root;
        helper(left);
        helper(right);
    }
}
