public class add_list {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode r= new ListNode(-1);

        ListNode dumy = r;
        int cary =0;
        while (l1!=null||l2!=null||cary==0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int a = x+y+cary;

                cary=a/10;
                a=a%10;
                dumy.next=new ListNode(a);
                dumy=dumy.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return r.next;
    }

    public static void main(String[] args) {

    }
}