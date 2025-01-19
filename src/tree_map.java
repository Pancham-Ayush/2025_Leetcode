import java.util.*;

public class tree_map {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };



        ArrayList<Integer> l1 = new ArrayList<>(){
            {
                add(1);
                add(2);
                add(9);
                add(2);
                add(5);
                add(44);

            }

        };
       Integer ar[]= l1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(ar));

        TreeMap<Integer,Integer> t = new TreeMap<>(comparator);
        t.put(91,2);
        t.put(0,3);
        t.put(4,9);
        t.put(-1,0);

        System.out.println(t);
    }
}
