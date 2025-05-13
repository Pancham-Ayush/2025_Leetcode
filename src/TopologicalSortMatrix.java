//import java.util.Scanner;
//import java.util.Stack;
//
//public class TopologicalSortMatrix {
//
//   static void sort(int ar[][], int v[], int e, Stack s){
//        for (int i =0;i<e;i++){
//            if (v[i]==0) {
//                dfs(ar,v,e,i,s);
//            }
//
//        }
//       while (!s.isEmpty())
//           System.out.println(s.pop());
//    }
//    static void dfs(int a3r[][],int v[],int e ,int node ,Stack s){
//        v[node]=1;
//
//
//        for (int i =0;i<e;i++){
//            if(v[i]==0 && ar[node][i]==1){
//                dfs(ar,v,e,i,s);
//            }
//        }
//        s.add(node);
//
//    }
//    public static void main(String[] args) {
//        var sc = new Scanner(System.in);
//        System.out.println("enter no of vertex");
//        int e = sc.nextInt();
//        int arr[][]=new int[e][e];
//        System.out.println("enter no of edges");
//        int ed= sc.nextInt();
//        for (int i =0;i<ed;i++){
//            System.out.println("enter V1 V2");
//            int v1 =sc.nextInt();
//            int v2=sc.nextInt();
//            arr[v1][v2]=1;
//        }
//        int visited[]= new int[e];
//        sort(arr,visited,e,new Stack());
//
//    }
//
//
//}
