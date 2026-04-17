import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Insert_Delete_GetRandom_O_1 {
    class RandomizedSet {

        ArrayList<Integer> a ;
        HashMap<Integer,Integer> h ;
        Random r ;

        public RandomizedSet() {
            a= new ArrayList<>();
            h = new HashMap<>();
            r = new Random();
        }

        public boolean insert(int val) {
            if(h.containsKey(val))
                return false;
            int s =a.size();
            a.add(s,val);
            h.put(val,s);
            return true;
        }

        public boolean remove(int val) {
            if (!h.containsKey(val))
                return false;
         int x = h.get(val);
         int a_l = a.getLast();
         h.put(a_l,x);
         a.set(x,a_l);

         h.remove(val);
         a.removeLast();
         return true;
        }

        public int getRandom() {
            int i = r.nextInt(0,a.size());
            return a.get(i);
        }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
