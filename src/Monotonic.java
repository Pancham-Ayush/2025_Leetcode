import java.util.Arrays;
import java.util.Stack;
public class Monotonic {
    void height(int arr[]){
        int a[]= new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for (int i =arr.length-1;i>=0;i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();
            if (stack.isEmpty())
                a[i] = -1;
            else
                a[i] = stack.peek();
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(a));
        }

    public static void main(String[] args) {
        int x []={2,1,2,4,3};
        new Monotonic().height(x);
    }
    }

