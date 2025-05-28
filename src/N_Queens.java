import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[][] board = new int[n][n];
        helper(0, board, result);
        return result;
    }
    void helper(int n , int board[][], List<List<String>> result){
        if (n == board.length) {
           constructBoard(board,result);
            return;
        }
        for (int i=0;i<board.length;i++){
            if(issafe(n,i,board)){
                board[n][i]=1;
                helper(n+1,board,result);
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
    void constructBoard(int[][] board, List<List<String>> result) {
        List<String> boardConfig = new ArrayList<>();
        for (int[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (int cell : row) {
                sb.append(cell == 1 ? 'Q' : '.');
            }
            boardConfig.add(sb.toString());
        }
        result.add(boardConfig);
    }

}
