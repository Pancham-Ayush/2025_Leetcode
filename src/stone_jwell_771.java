import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stone_jwell_771 {

    public int numJewelsInStones(String jewels, String stones) {
    int count =0;

        List<Character> l = new ArrayList<>();
        for (char c : jewels.toCharArray()) {
            l.add(c);
        }
        for (char x: stones.toCharArray())
            if(l.contains(x))
                count++;
        return count;
    }
}
