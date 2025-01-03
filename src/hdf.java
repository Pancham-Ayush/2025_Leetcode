//import java.util.ArrayList;
//import java.util.Scanner;
//class appp {
//    private int id;
//    private String name;
//    private double balance;
//
//    public appp(int id, String name, double balance) {
//        this.id = id;
//        this.name = name;
//        this.balance = balance;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    @Override
//    public String toString() {
//        return "bankingapp{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", balance=" + balance +
//                '}';
//    }
//    static void search(ArrayList a){
//        for(appp b : a){
//            System.out.println(b);
//        }
//    }
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        var sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        ArrayList<Object> l= new ArrayList<>();
//        appp user[] = new appp[x];
//        for (int i =0;i<x;i++){
//            System.out.println("enter id for acc name and inital balance");
//            user[i]= new appp(sc.nextInt(), sc.nextLine(), sc.nextDouble());
//            l.add(user[i]);
//
//        }
//        x = sc.nextInt();
//        for(int i =0;i<x;i++){
//
//        }
//    }
//}
