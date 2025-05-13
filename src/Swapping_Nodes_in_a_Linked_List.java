public class Swapping_Nodes_in_a_Linked_List {

        public ListNode swapNodes(ListNode head, int k) {
//         first node
            ListNode temp=head;
            int count=0;
            ListNode a=null,b=null;

            for (int i=1;i<=k;i++) {
                count++;
                if (count == k) {
                    a = temp;
                }
                temp = temp.next;
            }
            int count2=0;

            while (temp!=null){
                ++count2;
                if (count2==count-k+1){
                    b=temp;
                }
                temp=temp.next;
            }
            int x = a.val;
            int y = b.val;
            a.val=y;
            b.val=x;
            return head;
        }

}
