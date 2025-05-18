public class Insert_Greatest_Common_Divisors_in_Linked_List {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp= head;

        while (temp != null && temp.next != null)
        {
            ListNode a=temp;
            ListNode b = temp.next;
            ListNode new1 = new ListNode(gcd(a.val, b.val));
            a.next=new1;
            new1.next=b;
            temp=b.next;

        }
        return head;
    }
    int gcd(int x, int y){
        if(y==0)
            return x;

        return gcd(y,x%y);
    }
}
