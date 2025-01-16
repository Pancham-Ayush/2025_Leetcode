import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class word_sub {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> l = new ArrayList<>();
       int maxf[]=new int[26];
        for (String y : words2) {
            int f[]= new int[26];
            for (char z : y.toCharArray())
                    f[z-'a']++;
            for (int i =0;i<26;i++){
                maxf[i]=Math.max(f[i],maxf[i]);
            }
        }

        for (String x: words1){
          int ch []= new int[26];
          for (char c: x.toCharArray())
                ch[c-'a']++;
          boolean cond= true;
          for (int i=0;i<26;i++){
              if(maxf[i]>ch[i]) {
                  cond = false;
                  break;
              }

          }
          if (cond)
              l.add(x);

        }
        return l;
    }
}
