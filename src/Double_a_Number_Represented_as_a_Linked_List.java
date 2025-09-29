public class Double_a_Number_Represented_as_a_Linked_List {
    public ListNode doubleIt(ListNode head) {
        head= helper(head);
        return helper2(head);
    }
    ListNode helper(ListNode head){
        ListNode temp = head;

        ListNode rev=null;
        while(temp!=null){
            ListNode temp1 =temp.next;
            temp.next=rev;
            rev=temp;
            temp=temp1;
        }
        return rev;

    }


    ListNode helper2(ListNode head){
        ListNode temp = head;
        int carry=0;
        ListNode rev=null;
        while(temp!=null){
            ListNode temp1 =temp.next;
            temp.next=rev;
            int sum =temp.val+carry;
            temp.val=sum%10;
            carry=sum/10;
            rev=temp;
            temp=temp1;
        }
        if(carry!=0){
            ListNode newNode=new ListNode(carry);
            newNode.next =rev;
            rev=newNode;
        }
        return rev;

    }
    ListNode helperd2(ListNode head){
        ListNode temp = head;
        int carry=0;
        ListNode rev=null;
        while(temp!=null){
            ListNode temp1 =temp.next;
            ListNode temp2=temp;
            int val =temp.val*2 +carry;
            temp2.val=val%10;
            carry=val/10;
            rev=temp;
            temp=temp1;
        }
        if(carry!=0){
            ListNode  node=new ListNode(carry);
            node.next=rev;
            return node;
        }
        return rev;
    }

}
