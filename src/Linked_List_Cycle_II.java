public class Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode ptr1 =slow;
                ListNode ptr2 = head;
                while (ptr1 != ptr2) {
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                return ptr1;
            }
        }
        return null;
    }
}
