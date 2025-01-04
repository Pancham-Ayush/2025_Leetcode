import java.util.EnumMap;

enum sym{

    I(1),V(5),X(10),L(50),C(100),M(1000),D(500);

    int x;

    sym(int x){
        this.x=x;
    }
    int give(){
        return x;
    }
    }
public class ROMAN_TO_INTEGER {

        public static  int romanToInt(String s) {

           int r=0;
           for(int i =0;i<s.length();i++){
               sym obj = sym.valueOf(String.valueOf(s.charAt(i)));
               int v = obj.give();
               if(i+1<s.length()){

                   sym obj2 = sym.valueOf(String.valueOf(s.charAt(i+1)));
                   int t =obj2.give();
                   if(v<t){
                       r+=(t-v);
                       i++;
                   }
                   else
                       r+=v;
               }else {
                   r += v;
               }

           }
            return r;
        }

    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));
    }
}
