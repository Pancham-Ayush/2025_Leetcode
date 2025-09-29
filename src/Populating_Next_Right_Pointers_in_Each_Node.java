import java.util.ArrayList;
import java.util.List;

public class Populating_Next_Right_Pointers_in_Each_Node {
    List<List<Node>> list=new ArrayList<>();
    public Node connect(Node root) {
        helper(root,0);
        return root;
    }
    void helper(Node root, int level) {
        if (root == null) return;
        if(list.size()<=level) list.add(new ArrayList<>());
        if(list.get(level).size()==0)
            list.get(level).add(root);
        else {
            list.get(level).getLast().next = root;
            root.next=null;
            list.get(level).add(root);
        }
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
}
