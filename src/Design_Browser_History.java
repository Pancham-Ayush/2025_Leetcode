import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Design_Browser_History {

    class BrowserHistory {

        Stack<String> stack;
        Queue<String> queue;
        public BrowserHistory(String homepage) {
           stack = new Stack<>();
           queue= new LinkedList<>();
           stack.add(homepage);
        }

        public void visit(String url) {

            stack.add(url);

        }

        public String back(int steps) {
            for (int i =0;i<steps;i++){
                if (!stack.isEmpty())
               queue.add( stack.pop());
            }
            return stack.peek();

        }

        public String forward(int steps) {
            for(int i =0;i<steps;i++)
                if(!queue.isEmpty())
                    stack.add(queue.poll());
            return stack.peek();
        }
    }

}
