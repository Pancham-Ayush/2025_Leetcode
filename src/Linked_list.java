import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> l= new LinkedList<>(){
            {
                add(1);
                add(99);
                add(188);
                addLast(-1);
                addFirst(0);
            }
        };
        System.out.println(l);
        l.removeIf(x->x%3==0);
        System.out.println(l);
        LinkedList <Integer>a= new LinkedList<>(List.of(1,2,3,4,55,9));
        l.removeAll(a);
        System.out.println(l);



    }
}
