//import java.util.ArrayList;
//import java.util.Collection;
//
////class ListNode {
////      int val;
////      ListNode next;
////      ListNode() {}
////      ListNode(int val) { this.val = val; }
////      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//
//public class sortList {
//    public ListNode mergeKLists(ListNode[] lists) {
//
//        ArrayList<Integer> l = new ArrayList<>();
//        for (ListNode ln:lists)
//        {
//            ListNode head =ln;
//             while (head!=null)
//             {
//               l.add(head.val);
//               head=head.next;
//            }
//        }
//        l.sort(null);
//
//        ListNode current = new ListNode(0); // Dummy node for simplicity
//
//
//        for (int val : l) {
//            current.next = new ListNode(val); // Create a new node with the value
//            current = current.next; // Move the pointer forward
//        }
//
//
//
//
//        return  current;
//    }
//
//}
