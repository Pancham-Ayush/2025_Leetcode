import java.util.ArrayList;
import java.util.List;

public class N_Queens_II {
//    public void totalNQueens(int n) {
//        int[][] board = new int[n][n];
//         helper(0, board);
//    }
//    void helper(int n , int board[][]){
//        if (n == board.length) {
//            for (int[] row : board) {
//                StringBuilder sb = new StringBuilder();
//                for (int cell : row) {
//                    System.out.print((cell == 1 ? 'Q' : '.')+" ");
//                }
//                System.out.println();
//
//            }
//            System.out.println();
//
//        }
//
//        for (int i=0;i<board.length;i++){
//            if(issafe(n,i,board)){
//                board[n][i]=1;
//                helper(n+1,board);
//                board[n][i]=0;
//            }
//        }
//
//
//    }
//    boolean issafe(int n ,int ind, int board[][]){
////        v
//        for (int i=0;i<board.length;i++){
//            if (board[i][ind]==1)
//                return false;
//        }
////        h
//        for (int i=0;i<board.length;i++){
//            if (board[n][i]==1)
//                return false;
//        }
////        ul
//        for (int i=n, j =ind;i>=0 && j>=0;i--,j--){
//            if (board[i][j]==1)
//                return false;
//        }
////        ur
//        for (int i=n, j =ind;i>=0 && j<board.length;i--,j++){
//            if (board[i][j]==1)
//                return false;
//        }
//
//        return true;
//
//    }
int res=0;

public int totalNQueens(int n) {
helper(new int[n][n],0);
return res;
}
void helper(int a[][],int n){
    if(n==a.length) {
        res++;
        return;
    }
    for(int i =0;i<a.length;i++)
        if (isSafe(a,n,i))
        {
             a[n][i]=1;
             helper(a,n+1);
             a[n][i]=0;
        }
}
boolean isSafe(int [][]a,int row,int col){
    int n =a.length;
    for (int i=0;i<row;i++)
        if(a[i][col]==1)
            return false;
    for(int i =row,j=col;i>=0&& j>=0;j--,i--)
        if (a[i][j]==1)
            return false;
    for(int i =row,j=col;i<n&& j<n;j++,i--)
        if (a[i][j]==1)
            return false;
    return true;

}
    public static void main(String[] args) {
        System.out.println(new N_Queens_II().totalNQueens(4));    }

}
