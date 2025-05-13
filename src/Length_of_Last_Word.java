public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        char[]c=s.toCharArray();
        int i=c.length-1;
        int x=0;
        for(;i>=0;i--) {
            if(!Character.isLetter(c[i]))
                break;

        }

            for(;i>=0;i--){
            if(Character.isLetter(c[i]))
                x++;
            else
                break;
        }
        return x;
    }
}
