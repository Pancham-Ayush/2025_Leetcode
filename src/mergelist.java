//import java.util.PriorityQueue;
//
//class ListNode {
//int val;
//ListNode next;
//ListNode() {}
//ListNode(int val) { this.val = val; }
//ListNode(int val, ListNode next) { this.val = val; this.next = next;
//}
//public class mergelist {
//
//
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//
//        PriorityQueue<Integer> pq= new PriorityQueue<>();
//        while (list1 != null || list2 != null) {
//            if (list1 != null) {
//                pq.add(list1.val);
//                list1 = list1.next;
//            }
//            if (list2 != null) {
//                pq.add(list2.val);
//                list2 = list2.next;
//            }
//        }
//        ListNode dummy = new ListNode(-1);
//        ListNode current = dummy;
//
//
//        while (!pq.isEmpty()) {
//            current.next = new ListNode(pq.poll());
//            current = current.next;
//        }
//
//
//        return dummy.next;
//    }
//}
