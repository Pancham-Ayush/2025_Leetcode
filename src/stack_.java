import java.util.List;
import java.util.Stack;
public class stack_ {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>(){
            {
                add(1);
                push(0);
                System.out.println("pop "+pop());
                push(7);
                push(8);
            }
        };
        System.out.println("Stack " +stack);
        System.out.println("peek "+stack.peek());
        System.out.println(stack.isEmpty());
        stack.addAll(List.of(1,2,3,4));
        System.out.println("Stack " +stack);
    }
}
