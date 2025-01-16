import java.util.HashSet;
import java.util.Set;

class ListNode {
      int val;
      ListNode next;

      ListNode() {};
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 public class remove_dup_list {
    public ListNode deleteDuplicates(ListNode head) {
//        Set<Integer>s= new HashSet<>();
//        ListNode re = new ListNode(-1);
//        ListNode head1= re;
//
//
//        while (head!=null){
//            if(s.add(head.val)){
//                head1.next=new ListNode(head.val);
//                head1 = head1.next;
//            }
//            head=head.next;
//        }
//        return re.next;

ListNode curr=head;
        while(curr!=null && curr.next!=null)
     {
         if(curr.val==curr.next.val)
         {
             curr.next=curr.next.next;
         }
         else
         {
             curr=curr.next;
         }
     }
        return head;
 }

     public static void main(String[] args) {

     }
}
