import java.util.ArrayList;
import java.util.List;

public class Phone_number_17 {


   static public List<String> letterCombinations(String digits) {
   String abc []= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
   List <String> l = new ArrayList<>();
       if (digits == null || digits.isEmpty()) {
           return new ArrayList<>();
       }
       l.add("");
   for(char x: digits.toCharArray()){

       String ab=abc[x-'2'];
       List<String> l2 = new ArrayList<>();
      for (String List:l) {

          for (char c : ab.toCharArray()) {
           l2.add(List+c);
          }
      }
      l=l2;
   }
        return l;
   }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
