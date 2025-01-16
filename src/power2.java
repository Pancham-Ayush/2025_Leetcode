import java.util.ArrayList;

class Tral {
    public static void main(String[] args) {
       int x[]={1,2,3,9,5,6,7,222,55,9};
        System.out.println(call(x,9,0,new ArrayList<Integer>()));
    }

    static ArrayList<Integer> call(int x[] , int target, int i ,ArrayList<Integer>al) {
        if (x[i]==target) {
        al.add(i+1);
        }

        if (i >= x.length-1) {
            return al;
        }
        return call(x,target,++i,al);
    }
}
