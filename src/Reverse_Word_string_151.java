import java.util.StringTokenizer;

public class Reverse_Word_string_151 {
    static public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String r="";
        while (st.hasMoreElements()){
            r=st.nextToken()+" "+r;
        }
//        r=r.substring(0,r.length()-1);
        return r.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("abbbc kkkkk              opppp"));
    }
}
