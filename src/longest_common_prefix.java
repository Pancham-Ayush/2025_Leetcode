import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class longest_common_prefix {

//        public static String longestCommonPrefix(String[] st) {
//            if(st==null||st[0]==""|| st.length == 0 )
//            {
//                return "";
//            }
//            String prefix = "";
//            for (int i = 0; i < st[0].length(); i++) {
//                char currentChar = st[0].charAt(i);
//                for (int j = 1; j < st.length; j++) {
//                    if (i >= st[j].length() || st[j].charAt(i) != currentChar) {
//                        return prefix;
//                    }
//                }
//                prefix += currentChar;
//            }
//            return prefix;
//
//        }
        public static String longestCommonPrefix(String[] strs) {

            StringBuilder stringBuilder = new StringBuilder("");
            if(strs.length==0|| strs[0].equals(""))
                return "";

            int i =0;
            int max = strs[0].length();
            for( ;i<max;i++){
                 stringBuilder.append(strs[0].charAt(i));
                 for (String x: strs)
                     if(!x.startsWith(stringBuilder.toString()))
                         return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();

            }
return stringBuilder.toString();
        }

    public static void main(String[] args) {
        String a[]={"flower","flora","flight"};
        System.out.println(longestCommonPrefix(a));
    }
}
