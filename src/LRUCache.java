import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    FixedLinkedMap<Integer,Integer> map;
    public LRUCache(int capacity) {
     map = new FixedLinkedMap<>(capacity);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
         map.put(key,value);
    }

    class FixedLinkedMap <k,v>extends LinkedHashMap<k,v> {
        int capacity;
        public FixedLinkedMap(int capacity) {
            super(capacity, 0.75f, true);

            this.capacity = capacity;
        }
        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > capacity;
        }


    }
}

