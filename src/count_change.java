public class count_change {
    static public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int count=0;
        for (int i=0;i<s.length();i++){
        if(i+1!=s.length())
            if(s.charAt(i)!=s.charAt(i+1))
             count++;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countKeyChanges("aAbBcC"));
    }
}
