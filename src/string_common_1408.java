import java.util.ArrayList;
import java.util.List;
public class string_common_1408 {
   static public List<String> stringMatching(String[] words) {
        List<String>p= new ArrayList<>();
       for (int i =0;i<words[0].length();i++){

           for (int j =i+1;j<words[0].length();j++){
               String temp =words[0].substring(i,j);
               boolean n = true;
               for (int z =1;i<words.length;z++) {
                   if (!words[z].contains(temp))
                       n = false;
                   break;
               }
               if (n == true){
                   
                   p.add(temp);
           }
           }
       }

        return p;
    }
    public static void main(String[] args) {
        String[] s={"mass","as","hero","superhero"};
        System.out.println(stringMatching(s));

    }
}
