import java.util.Arrays;
import java.util.Scanner;

public class spars {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int x[][]= new int [3][3];
        int count =0;
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                x[i][j]=sc.nextInt();
                if(x[i][j]==0){
                    count ++;
                }
            }
        }
        for(int a[]:x){
            System.out.println(Arrays.toString(a));
        }
        System.out.println(count);
    }
}
