import java.util.Scanner;

public class stringexc {

    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String st= sc.nextLine();
        String arr[]= st.split(" ");
        String result ="";
        for(int i =0;i< arr.length;i++){
            result+=arr[i].charAt(arr[i].length()-1)+arr[i].substring(1, arr[i].length()-1)+arr[i].charAt(0)+" ";
        }
        System.out.println(result);
    }
}
