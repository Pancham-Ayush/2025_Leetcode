import java.util.HashMap;

public class Copy_List_with_Random_Pointer_Medium {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        var map=new HashMap<Node,Node>();
        Node temp=head;

        while (temp!=null){
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        temp=head;
        while (temp!=null){
            Node cur =map.get(temp);
            cur.next=map.get(temp.next);
            cur.random=map.get(temp.random);
            temp=temp.next;
        }

        return map.get(head);
    }
}
