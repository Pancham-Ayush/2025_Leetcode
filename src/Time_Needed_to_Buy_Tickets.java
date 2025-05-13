import java.util.ArrayDeque;
import java.util.Queue;

public class Time_Needed_to_Buy_Tickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count =0;
        if(tickets.length==1)
            return tickets[0];
        Queue<Integer> q= new ArrayDeque<>();
        for (int i=0;i<tickets.length;i++)
            q.add(i);
        while (tickets[k]!=0){
            if(q.size()==1) {
                count = count + tickets[q.remove()];
                break;
            }
            int x=q.remove();
            tickets[x]--;
            count++;
            if(tickets[x]!=0)
                q.add(x);
        }

        return count;
    }
}
