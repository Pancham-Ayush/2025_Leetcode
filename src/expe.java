class coustom extends Exception{
    String x;
    coustom(String x){
        super(x);
        this.x = x;
    }
}
public class expe {
    public static void main(String[] args) {
        try {
//            throw new coustom("noooo");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("ok");
        }
    }
}
