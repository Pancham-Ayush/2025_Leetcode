public class Delete_the_Middle_Node_of_a_Linked_List {
    public ListNode deleteMiddle(ListNode head) {
        ListNode prev=null;
        ListNode midle=head;
        ListNode fast= head;
        if(head.next==null)
            return null;
        while (fast!=null &&fast.next!=null){

            fast=fast.next.next;
            prev=midle;
            midle=midle.next;
        }
        if (prev!=null)
            prev.next=midle.next;


        return head;
    }
}
