public class Remove_Nth_Node_From_End_of_List {

        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode trial = head;
            int count =0;
            while (trial !=null){
                count++;
                trial=trial.next;
            }
            if (count==1 || count==0)
                return null;
            if (count==n)
                return head.next;
            trial= head;
            ListNode prev = null, cur = null,next=null;

            for (int i =1;i<=count;i++){
                if (i==count-n){
                    prev=trial;
                }
                if (i==count-n+1){
                    cur=trial;
                }
                if (i==count-n+2){
                    next=trial;
                }
                trial=trial.next;

            }
            if (next!=null){
                prev.next=next;
            }
            else {
                prev.next=null;
            }
            return head;
        }

}
