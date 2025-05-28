import java.util.ArrayList;

public class Reverse_Nodes_in_k_Group {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode ch=null,ct=null;
        ListNode th=null,tt=null;
        ListNode temp =head;
        int count =0;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        temp =head;
        ListNode next;
        while (count>0){
            if(count<k)
                break;
            for (int i =0;i<k;i++){
                next=temp.next;
                if(th==null){
                    th=tt=temp;
                }
                else {
                    temp.next=th;
                    th=temp;

                }
                temp=next;
            }
            if(ch==null){
                ch =th;
                ct=tt;
            }
            else {
                ct.next=th;
                ct=tt;
            }
            th=tt=null;
            count-=k;

        }
        if(temp!=null)
            ct.next=temp;
        return ch;
    }

}