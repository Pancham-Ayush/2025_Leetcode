import java.util.Stack;

class MinStack {
  Stack<Integer> stack;
  Stack<Integer> minstack;

        public MinStack() {
            stack = new Stack<>();
            minstack = new Stack<>();

        }

        public void push(int val) {
            stack.push(val);
            if (minstack.isEmpty() || val <= minstack.peek()) {
                minstack.push(val);
            }
        }

        public void pop() {
            int poppedValue = stack.pop();
            if (poppedValue == minstack.peek()) {
                minstack.pop();
            }
        }

        public int top() {
            return stack.pop();
        }

        public int getMin() {
    return  minstack.pop();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

