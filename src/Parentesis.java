import java.util.Stack;

public class Parentesis {
    static public boolean isValid(String s){
        char a[]=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        int i =0;
        while (i<a.length){
            char current = a[i];
            if(a[i]=='['||a[i]=='{'||a[i]=='(')
                 stack.push(a[i]);
            else if(a[i]==']'||a[i]=='}'||a[i]==')') {
                if (stack.isEmpty()) {
                    return false; // Mismatched closing parenthesis
                }

                char top = stack.pop();
                if ((current == ')' && top != '(') ||
                        (current == '}' && top != '{') ||
                        (current == ']' && top != '[')) {
                    return false; // Mismatched parenthesis types
                }
            }
            i++;

        }
        if(stack.size()==0){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isValid("((())){}[]}"));
    }
}
