import java.util.Arrays;
import java.util.Stack;

public class Reverse_Words_in_a_String {
    public String reverseWords(String s) {

        if(s.length()==0|| s.length()==1)
            return s;

        Stack stack = new Stack();

        for (String x : s.split(" "))
            if(!x.isBlank())
                stack.push(x);

        StringBuilder stringBuilder = new StringBuilder();

        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop()+" ");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();


    }
}
