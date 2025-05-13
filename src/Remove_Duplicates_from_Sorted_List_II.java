public class Remove_Duplicates_from_Sorted_List_II {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp =head;
        ListNode prev=new ListNode(0,head);
        ListNode x=prev;
        while ( temp.next != null){
            boolean a=false;
            if(temp.val==temp.next.val){
                a=true;
                while (temp.val== temp.next.val)
                    temp.next=temp.next.next;
            }
            if(a==true)
                 prev.next=temp.next;
            prev=temp;
            temp=temp.next;
        }
        return x.next;
    }
}
