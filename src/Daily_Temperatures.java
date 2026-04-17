import java.util.Stack;

public class Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temperatures) {

        int n =temperatures.length;
        int res []= new int[n];
        Stack<Integer> stack =new Stack<>();
        for(int i =n-1;i>=0;i--){
            while (!stack.isEmpty())
            {
               if(temperatures[stack.peek()]>temperatures[i])
                   break;
               else
                   stack.pop();
            }
            res[i]= stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }

        return res;
    }

    public static void main(String[] args) {

        dailyTemperatures(new int[]{1,2,22,3,4,10,1});
    }

}
