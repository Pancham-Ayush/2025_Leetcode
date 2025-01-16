public class uniqepath {
    static public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int c=0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        for(int i =0;i<m;i++){
            boolean b = true;
            for (int j=0;j<n;j++) {
                if (obstacleGrid[i][j] == 1) {
                    b = false;
                    break;
                }
            }
            if (b)
                c++;
        }
        for(int i =0;i<n;i++){
            boolean b = true;
            for (int j=0;j<m;j++){
                if(obstacleGrid[j][i]==1) {
                    b = false;
                    break;
                }
            }
            if (b)
                c++;
        }
        return c;
        }

    public static void main(String[] args) {
        int[][]a={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(a));
    }
}