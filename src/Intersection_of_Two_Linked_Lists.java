import java.util.HashSet;

public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null|| headB== null)
            return null;
        ListNode a = headA,b= headB;
        while (a!=b){

            a=(a==null)?a=headB:(a=a.next);
            b=(b==null)?b=headA:(b=b.next);

        }


        return a;
    }
}
