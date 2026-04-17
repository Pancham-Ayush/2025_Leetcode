import java.util.Stack;

public class Simplify_Path {

    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        String a[]= path.split("/");

        for (String x: a) {
            if(x.equals(".")|| x.equals(""))
                continue;
            if(x.equals(".."))
            {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else
                stack.push(x);
        }

        StringBuilder stringBuilder = new StringBuilder();
       for (String x : stack)
           stringBuilder.append("/"+x);
       return stringBuilder.length()==0?"/":stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Simplify_Path().simplifyPath("/.../a/../b/c/../d/./"));
//        "/.../b/d"
    }
}
