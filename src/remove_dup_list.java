//import java.util.HashSet;
//import java.util.Set;
//
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int val) { this.val = val;};
//// public class remove_dup_list {
////    public ListNode deleteDuplicates(ListNode head) {
////        Set<Integer>s= new HashSet<>();
////        ListNode re = new ListNode(-1);
////        ListNode head1= re;
////
////
////        while (head!=null){
////            if(s.add(head.val)){
////                head1.next=new ListNode(head.val);
////                head1 = head1.next;
////            }
////            head=head.next;
////        }
////        return re.next;
////
////ListNode curr=head;
////        while(curr!=null && curr.next!=null)
////     {
////         if(curr.val==curr.next.val)
////         {
////             curr.next=curr.next.next;
////         }
////         else
////         {
////             curr=curr.next;
////         }
////     }
////        return head;
//// }
//     public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        ListNode sec = new ListNode(2);
//        ListNode thr = new ListNode(3);
//        head.next=sec;
//        sec.next=thr;
//        thr.next=null;
//        ListNode temp=head;
//
//        while (temp!=null){
//            System.out.println(temp.val);
//            temp=temp.next;
//        }
//     }
//}
