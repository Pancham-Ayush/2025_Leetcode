import java.util.ArrayList;
import java.util.List;

public class exracandy_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> l = new ArrayList<>();
        int max = candies[0];
        int len = candies.length;
        for (int i = 1; i < len; ++i) {
            if (candies[i] > max) max = candies[i];
        }
    for(int i=0;i<candies.length;i++){
        boolean c=(candies[i] + extraCandies >= max) ? (l.add(true)) : l.add(false);
    }

    return l;
    }
}
