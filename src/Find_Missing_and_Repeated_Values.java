public class Find_Missing_and_Repeated_Values {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int a1 = 0, b1 = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int val = Math.abs(grid[r][c]);
                int row = (val - 1) / n;
                int col = (val - 1) % n;
                if (grid[row][col] < 0)
                    a1 = val;
                else
                    grid[row][col] = -grid[row][col];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    b1 = i * n + j + 1;
                    break;
                }
            }
        }
        return new int[]{a1, b1};


    }
}
