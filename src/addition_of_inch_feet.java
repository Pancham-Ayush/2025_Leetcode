public class addition_of_inch_feet {
    void meth(int f1,int i1,int f2 , int i2){
        System.out.println(f1+f2+(i1+i2)/12);
        System.out.println((i1+i2)%12);
    }

    public static void main(String[] args) {
        addition_of_inch_feet obj = new addition_of_inch_feet();
        obj.meth(10,2,2,12 );
    }
}
