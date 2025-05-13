 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if ( head ==null ||head.next==null )
            return head;
        ListNode temp = new ListNode(-1,head);
        ListNode prev = temp;
        ListNode pointer =prev;
        while ( prev.next!=null && prev.next.next!=null){
            ListNode x =prev;
            ListNode y=prev.next;
            ListNode z=prev.next.next;
            ListNode a=prev.next.next.next;
            y.next=a;
            z.next=y;
            x.next=z;
            prev=y;
        }
        return pointer.next;
    }
}
