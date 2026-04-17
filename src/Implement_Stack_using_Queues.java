import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues {

    class MyStack {

        Queue<Integer> read = new LinkedList<>();
        Queue<Integer> write = new LinkedList<>();

        public MyStack() {}

        public void push(int x) {
            write.add(x);
        }

        public int pop() {
            if (read.isEmpty()){
                while (!write.isEmpty())
                    read.add(write.poll());
            }
            return read.poll();
        }

        public int top() {
            if (read.isEmpty()){
                while (!write.isEmpty())
                    read.add(write.poll());
            }
            return read.poll();
        }

        public boolean empty() {

            return read.isEmpty() && write.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

}
