public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp =head;
        if (temp.next==null)
            return temp;
        while (temp.next!=null){
            if(temp.val==temp.next.val)
                temp.next=temp.next.next;
            temp=temp.next;

        }
        return head;
    }
}
