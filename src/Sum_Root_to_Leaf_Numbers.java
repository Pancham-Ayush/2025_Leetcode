public class Sum_Root_to_Leaf_Numbers {

    int sum=0;
    public int sumNumbers(TreeNode root) {
        helper(root,new StringBuilder());
        return sum;
    }
    void helper(TreeNode node, StringBuilder stringBuilder){
                if(node==null)
                    return ;
        stringBuilder.append(node.val);

        if (node.left == null && node.right == null) {
                sum += Integer.parseInt(stringBuilder.toString());
            } else {
                helper(node.left, stringBuilder);
                helper(node.right, stringBuilder);
            }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
    }
}
