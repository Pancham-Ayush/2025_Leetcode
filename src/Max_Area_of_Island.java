
public class Max_Area_of_Island {
    int row , col;
    int[][] grid;
    int helper(int r , int c){
        if(r<0 || c<0 || r>=row || c>=col ||grid[r][c]==0 )
            return 0;
       int a= 1;
        grid[r][c]=0;

        a+=helper(r+1,c);
        a+= helper(r-1,c);
        a+=helper(r,c+1);
        a+=helper(r,c-1);

        return a;
    }
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        row=grid.length;
        col= grid[0].length;

        int max =0;

        for(int i =0;i<row;i++)
            for (int j =0;j<col;j++)
                if(this.grid[i][j]==1)
                    max =Math.max(max,helper(i,j));
        return max;

    }
}
