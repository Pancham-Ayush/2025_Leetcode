import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LFUCache
{

        HashMap<Integer,Integer> h;

    int capacity,x=0;

        public LFUCache(int capacity) {
            this.capacity=capacity;
            h=new LinkedHashMap<>(capacity, 0.75F,true);
        }

        public int get(int key) {
            return h.getOrDefault(key,-1);
        }

        public void put(int key, int value) {
            if(h.size()>=capacity){
                h.remove(h.keySet().iterator().next());
                }
            h.put(key,value);

        }

}
