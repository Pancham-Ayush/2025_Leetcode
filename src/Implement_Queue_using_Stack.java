import java.util.Stack;

public class Implement_Queue_using_Stack {

    class MyQueue {

        Stack<Integer> read = new Stack<>();
        Stack<Integer> write = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            write.push(x);
        }

        public int pop() {
            if(read.isEmpty())
            {
                while (!write.isEmpty())
                    read.push(write.pop());
                return read.pop();
            }
            return read.pop();
        }

        public int peek() {
            if(read.isEmpty())
            {
                while (!write.isEmpty())
                    read.push(write.pop());
                return read.peek();
            }
            return read.peek();

        }

        public boolean empty() {

            return read.isEmpty()&& write.isEmpty();
            }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

}
