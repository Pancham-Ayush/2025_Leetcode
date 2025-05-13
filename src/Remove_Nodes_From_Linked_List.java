public class Remove_Nodes_From_Linked_List {
//    You are given the head of a linked list.
//
//    Remove every node which has a node with a greater value anywhere to the right side of it.
//
//    Return the head of the modified linked list.


    public ListNode removeNodes(ListNode head) {

//            reverse
        ListNode temp =head, prev=null;
        while (temp!=null){
            ListNode next = temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        ListNode rhead =prev;
        int x= prev.val ;
        while ( prev!=null && prev.next!=null){
            x=Math.max(x,prev.val);
            if(x>prev.next.val)
                prev.next=prev.next.next;
            else
                prev=prev.next;
        }
        ListNode temp2 =rhead, prev2=null;
        while (temp2!=null){
            ListNode next = temp2.next;
            temp2.next=prev2;
            prev2=temp2;
            temp2=next;
        }
        return prev2;
    }
}
