import java.util.*;
public class Main {
    public static void main(String[] args) {

var h= new HashMap<Integer,Integer>(11);
h.put(1,1);
h.put(2,4);
h.put(3,6);
h.put(4,8);
        Map.Entry<Integer,Integer>e = (Map.Entry<Integer, Integer>) h.entrySet();
        Iterator<Integer> i=h.keySet().iterator();
        while (i.hasNext()){
            Integer x = i.next();
            System.out.println(x+"  "+h.get(x));
            if(x==1){
                i.remove();
//              h.remove(x) not work
            }
        }
        System.out.println(h);
    }
}