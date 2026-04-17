 class dummy {

    int x =88;

}

 class b extends dummy{


    void x(){
        System.out.println(x);
    }
}

class fn{
    static void main() {
        dummy d = new b();
        System.out.println(d.x);
        new b().x();

    }
}