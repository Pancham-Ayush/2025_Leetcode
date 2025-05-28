import java.util.ArrayList;
import java.util.List;

public class N_Queens_II {
    public void totalNQueens(int n) {
        int[][] board = new int[n][n];
         helper(0, board);
    }
    void helper(int n , int board[][]){
        if (n == board.length) {
            for (int[] row : board) {
                StringBuilder sb = new StringBuilder();
                for (int cell : row) {
                    System.out.print((cell == 1 ? 'Q' : '.')+" ");
                }
                System.out.println();

            }
            System.out.println();

        }

        for (int i=0;i<board.length;i++){
            if(issafe(n,i,board)){
                board[n][i]=1;
                helper(n+1,board);
                board[n][i]=0;
            }
        }


    }
    boolean issafe(int n ,int ind, int board[][]){
//        v
        for (int i=0;i<board.length;i++){
            if (board[i][ind]==1)
                return false;
        }
//        h
        for (int i=0;i<board.length;i++){
            if (board[n][i]==1)
                return false;
        }
//        ul
        for (int i=n, j =ind;i>=0 && j>=0;i--,j--){
            if (board[i][j]==1)
                return false;
        }
//        ur
        for (int i=n, j =ind;i>=0 && j<board.length;i--,j++){
            if (board[i][j]==1)
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        new N_Queens_II().totalNQueens(4);    }

}
