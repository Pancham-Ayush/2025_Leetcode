public class Add_Binary {
    public String addBinary(String a, String b) {
     StringBuilder s=new StringBuilder();
     int x =a.length()-1;
     int y = b.length()-1;
     int cary =0;
     while (cary!=0 || x>=0 || y>=0){
         int bita = (x>=0) ?a.charAt(x--):0;
         int bitb= (y>=0) ? b.charAt(y--):0;
         int sum = bitb+bita+cary;
         s.append(sum%2);
         cary=sum/2;
     }

     return s.reverse().toString();
    }
}
