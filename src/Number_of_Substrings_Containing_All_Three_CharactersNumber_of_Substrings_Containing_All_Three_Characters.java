public class Number_of_Substrings_Containing_All_Three_CharactersNumber_of_Substrings_Containing_All_Three_Characters {

    public int numberOfSubstrings(String s) {


        return backtrack(s, 0);
    }

    int backtrack(String s, int n) {
        int i = n;
        int ans = 0;
        int x = 0, y = 0, z = 0;
        for (; i < s.length(); i++) {

            if (s.charAt(i) == 'a')
                x++;
            if (s.charAt(i) == 'b')
                y++;
            else
                z++;
            if (x > 0 & y > 0 & z > 0) {
                ans += s.length() - i;
                break;
            }
        }
        return ans + backtrack(s, n + 1);

    }

}