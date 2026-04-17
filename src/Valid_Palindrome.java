public class Valid_Palindrome {
    public boolean isPalindrome(String s) {

        s= s.replace("[^A-Za-z0-9]","").toLowerCase();
        for(int i=0,j=s.length()-1;i<s.length()&& j>=0 && i<j ;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
}
