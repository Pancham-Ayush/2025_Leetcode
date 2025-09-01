import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    static String[] MAPPING = {
            "","",   "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        var l=new ArrayList<String>();
        if(digits.equals(""))
            return l;
        helper(digits,l,new StringBuilder(),0);

        return l;
    }
    void helper(String digit,List<String>l,StringBuilder x,int index){

        if(index==digit.length())
        {
            l.add(x.toString());
            return;
        }
        String cur=MAPPING[digit.charAt(index)-'0'];
        for (int i=0;i<cur.length();i++){
            x.append(cur.charAt(i));
            helper(digit,l,x,index+1);
            x.deleteCharAt(x.length()-1);
        }
    }

    public static void main(String[] args) {
//        ArrayList<Integer>name = new ArrayList<>();
//        name.add(1);
//        name.add(5);
//        var x = new ArrayList<Integer>();
//        x.add(34);
//
//        name.addAll(x);
//        System.out.println(name);

    var x=8;
    var u ="fcghjk";
    var c =new ArrayList<Integer>();
    var h = new HashMap<Integer,String>();
    h.put(1,"abc");
    h.put(2,"asd");
        System.out.println(h.get(1));

    }
}
