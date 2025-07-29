public class Integer_to_English_Words {

    private static String[] belowTwenty = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    private static String[] tens = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private static String[] thousands = { "Thousand", "Million", "Billion"};
    public String numberToWords(int num) {

        StringBuilder s = new StringBuilder();
        String nums =String.valueOf(num);
        int x=0;
    }
    String helper(int n,String num,int ind ){
        int y=Integer.valueOf(num.charAt(ind));
        int pos=num.length()-ind;
        if(y==0)
            return "";
        else if(pos==8)
            return belowTwenty[y-1]+" "+thousands[2];
        else if(pos==7)
            return belowTwenty[y-1]+" "+thousands[1];
        else if(pos==6)
            return belowTwenty[y-1]+" "+thousands[0];
    }
}
