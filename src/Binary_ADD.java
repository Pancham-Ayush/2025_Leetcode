import java.util.Scanner;

public class Binary_ADD {
     void bin(int n){
        int result =0,place =1,reminder;
        while(n>0){
            reminder=n%2;
            result+=(place*reminder);
            place*=10;
            n/=2;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_ADD o[]= new Binary_ADD[4];
        for (int i =0;i<4;i++) {
            o[i]= new Binary_ADD();
            int x = sc.nextInt();
            int y = sc.nextInt();
           o[i].bin(x);
           o[i].bin(y);
           o[i].bin(x + y);
        }
    }
}