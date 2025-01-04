import java.util.ArrayList;
import java.util.List;

public class longest_common_prefix {

        public static String longestCommonPrefix(String[] st) {
            if(st==null||st[0]==""|| st.length == 0 )
            {
                return "";
            } String prefix = "";
            for (int i = 0; i < st[0].length(); i++) {
                char currentChar = st[0].charAt(i);
                for (int j = 1; j < st.length; j++) {
                    if (i >= st[j].length() || st[j].charAt(i) != currentChar) {
                        return prefix;
                    }
                }
                prefix += currentChar;
            }
            return prefix;

        }

    public static void main(String[] args) {
        String a[]={"flower","flora","flight"};
        System.out.println(longestCommonPrefix(a));
    }
}
