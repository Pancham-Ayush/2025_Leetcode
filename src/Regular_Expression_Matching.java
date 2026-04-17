import java.util.Stack;

public class Regular_Expression_Matching {

    public boolean isMatch(String s, String p) {

        int i = 0;
        int j = 0;
        while (i < s.length()) {

            if (j >= p.length()) {
                return false;
            }
            if (p.charAt(j) == '*') {
                if (j - 1 >= 0) {
                    if (p.charAt(j - 1) == '.') {
                        i++;
                        continue;
                    } else if (p.charAt(j - 1) == s.charAt(i)) {
                        i++;
                        continue;
                    } else {
                        j++;
                        continue;
                    }
                }
            }
                if (p.charAt(j) == '.') {
                    j++;
                    i++;
                    continue;
                }
                if (s.charAt(i) != p.charAt(j))
                    return false;

                i++;
                j++;
            }
            return j==p.length() ;
        }
    }
