import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Leve_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) {
            res.add(new ArrayList<>());
            return res;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node == null) continue;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                l.add(node.val);

            }
            res.add(l);
        }
        return res;
    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder2(TreeNode root) {
            helper(root, 0);
            return res;
    }
    void helper(TreeNode root ,int level) {
        if(root == null) return;
        if (res.size()<=level) res.add(new ArrayList<>());
        helper(root.left, level + 1);
        helper(root.right, level + 1);
        res.get(level).add(root.val);

    }



}
