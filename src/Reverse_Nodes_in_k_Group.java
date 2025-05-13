//public class Reverse_Nodes_in_k_Group {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode c= head;
//        int x=0;
//        while (c!=null) {
//            ++x;
//            c = c.next;
//        }
//        ListNode temp = head;
//        ListNode r=null;
//        while (x>=k)
//        {   ListNode h1=temp;
//            ListNode l1=temp;
//            for (int i =0;i<k;i++){
//                l1=l1.next;
//            }
//            ListNode h2=l1.next;
//            l1.next=null;
//            ListNode
//
//        }
//        return null;
//
//    }
//    public ListNode reverseList(ListNode head) {
//
//        ListNode prev =null;
//        while (head!=null){
//            ListNode next = head.next;
//            ListNode cur = head;
//            cur.next=prev;
//            prev=cur;
//            head = next;
//        }
//        return head;
//    }
//}
