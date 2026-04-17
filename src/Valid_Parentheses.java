import java.util.Stack;

public class Valid_Parentheses {


    public boolean isValid(String s) {

        Stack stack = new Stack();
        if(s.length()==1)
            return false;
        for(char x: s.toCharArray())
        {
            if(x=='('||  x=='{' || x=='['){
                stack.push(x);
            }
            else if(x==']'||  x=='}' || x==')'){
                if(stack.isEmpty())
                    return false;
                char sp = (char) stack.peek();
                if(sp=='(' && x ==')' || sp=='{' && x=='}' || sp=='[' && x==']'){
                    stack.pop();
                }
                else {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
