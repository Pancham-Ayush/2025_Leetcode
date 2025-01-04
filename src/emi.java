
interface x{
    static double m(double prin,double intrest,int dur){
        intrest = intrest/1200;
        double x=(prin*intrest)/(1-Math.pow(1+intrest,-dur));
        return x;
    }
}
class emi {


    public static void main(String[] args) {
        System.out.println(x.m(5000d,10.0,12)
);}
}
