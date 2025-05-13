public class varARGS {

    void met1(int b,int ...a){
        System.out.println(b);
        for (int x:a)
            System.out.println(x+" ");
    }
    public static void main(String[] args) {
        new varARGS().met1(1);
//        new varARGS().met1(); error
    }
}
