public class reverse_linkedlist {
    public ListNode reverseList(ListNode head) {

        ListNode prev =null;
        while (head!=null){
            ListNode next = head.next;
            ListNode cur = head;
            cur.next=prev;
            prev=cur;
            head = next;
        }
        return head;
    }

}
