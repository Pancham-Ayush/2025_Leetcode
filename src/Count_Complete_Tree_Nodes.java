public class Count_Complete_Tree_Nodes {
    int x ;
    public int countNodes(TreeNode root) {
        x=0;
        helper(root);
        return x;
    }
    void helper(TreeNode node){
        if ( node==null)
            return;
        x++;
        helper(node.left);
        helper(node.right);
    }
}
