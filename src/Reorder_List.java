import java.util.ArrayDeque;
import java.util.Deque;

public class Reorder_List {
    public void reorderList(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode node = head;
        while (node != null) {
            stack.addLast(node);
            node = node.next;
        }
        boolean x=true;
        ListNode temp=new ListNode(0,head);
        ListNode temp2=temp;
        while (!stack.isEmpty()) {
            ListNode node1=(x)?stack.pollFirst():stack.pollLast();
            temp.next=node1;
            temp=temp.next;
            x=!x;
        }
        temp.next=null;
        head=temp2.next;
    }
    public void reorderList2(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode secRev = slow.next;
        slow.next=null;
        ListNode n =null;
        while (secRev!=null){
            ListNode temp=secRev.next;
            secRev.next=n;
            n =  secRev;
            secRev=temp;
        }
        ListNode temp=head;
        while (n!=null){
            ListNode rev =n;
            n=n.next;
            ListNode temp2=temp.next;
            temp.next=rev;
            rev.next=temp2;
            temp=temp2;

        }
    }

}
