public class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0,head);
        ListNode x=dummy;
        while (dummy.next != null) {
            if (dummy.next.val == val) {
                dummy.next = dummy.next.next;
            }
            else
                dummy = dummy.next;
        }
        return x.next;
    }
}
