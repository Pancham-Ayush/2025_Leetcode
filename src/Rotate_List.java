public class Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        if(head==null|| head.next==null||k==0)
            return head;
        int leng=1;
        while (temp.next!=null){
            leng++;
            temp=temp.next;
        }
        k = k % leng;
        if (k == 0) return head;
            temp.next = head;
        for (int i = 0; i < leng - k-1; i++) {
            head = head.next;
        }
        head.next=null;
        return head;
    }
}
