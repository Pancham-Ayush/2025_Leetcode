public class Score_of_a_String {
    public int scoreOfString(String s) {
        int prev=s.charAt(0);
        int sum=0;
        for (int i=1;i<s.length();i++){
            sum+=Math.abs(s.charAt(i)-prev);
            prev=s.charAt(i);
        }
        return sum;
    }
}
