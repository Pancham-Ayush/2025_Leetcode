public class Word_Search {
    boolean b =false;
    public boolean exist(char[][] board, String word) {
        for(int i =0;i<board.length;i++)
            for (int j =0;j<board[i].length;j++) {
                helper(board, word, i, j, 0);
                if(b)
                    return b;
            }
        return b;
    }
    void helper(char[][] board, String word,int row,int col,int index) {
        int m = board.length - 1;
        int n = board[0].length - 1;
        int c = word.length();
        if (index == c) {
            b = true;
            return;
        }
        if (row >= 0 && col >= 0 && row <= m && col <= n) {
            if (board[row][col] == '#')
                return;
            if (board[row][col] == word.charAt(index)) {
                char x = board[row][col];
                board[row][col] = '#';
                helper(board, word, row + 1, col, index+1);
                helper(board, word, row, col + 1, index+1);
                helper(board, word, row - 1, col, index+1);
                helper(board, word, row, col - 1, index+1);

                board[row][col] = x;
            } else
                return;
        }
    }
}
