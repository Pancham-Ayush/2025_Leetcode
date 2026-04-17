import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Populating_Next_Right_Pointers_in_Each_Node_II {

//        List<List<Node>> list=new ArrayList<>();
//        public Node connect(Node root) {
//            helper(root,0);
//            return root;
//        }
//        void helper(Node root, int level) {
//            if (root == null) return;
//            if(list.size()<=level) list.add(new ArrayList<>());
//            if(list.get(level).size()==0)
//                list.get(level).add(root);
//            else {
//                list.get(level).getLast().next = root;
//                root.next=null;
//                list.get(level).add(root);
//            }
//            helper(root.left, level + 1);
//            helper(root.right, level + 1);
//        }
public Node connect(Node root) {
    if (root == null)
        return null;

    Queue<Node> queue = new ArrayDeque<>();
    queue.add(root);

    while (!queue.isEmpty()){
        int s =queue.size();
        Node temp = null;
        for (int i =0;i<s;i++){
            Node node = queue.poll();
            if (node==null)
                break;
            if(temp==null)
            {
                temp=node;
                node.next=null;
            }
            else {
            temp.next=node;
            temp=node;
            node.next=null;

            }
            if(node.left!=null)
                queue.add(node.left);
            if (node.right!=null)
                queue.add(node.right);
        }

    }

    return root;
    }
}
