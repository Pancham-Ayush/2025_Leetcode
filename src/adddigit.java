public class adddigit {
    static public int addDigits(int num) {
        String x= String.valueOf(num);
        int sum=0;
        for(char s: x.toCharArray()){
            sum+=s-'0';
        }

        String y= String.valueOf(sum);
        int r=0;
        for(char s: y.toCharArray()){
            r+=s-'0';
        }
        if(r>10){
            return  r%10;
        }
return r;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(199));
    }
}
