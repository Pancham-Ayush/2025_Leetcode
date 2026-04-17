import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Average_of_Levels_in_Binary_Tree {

    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> l = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int t = queue.size();
            long sum = 0;

            for (int i = 0; i < t; i++) {
                TreeNode x = queue.poll();
                sum += x.val;
                if (x.left != null)
                    queue.add(x.left);
                if (x.right != null)
                    queue.add(x.right);

            }

            l.add((double) sum / t);
        }
        return l;
    }
}
