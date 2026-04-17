public class Number_of_Islands {

    void helper(char [][]grid,int x,boolean[] v)
    {
        v[x] = true;
        for (int i =0;i<grid.length;i++){
            if(grid[x][i]=='1')
                helper(grid,i,v);
        }
    }
    public void numIslands(char[][] grid) {

        boolean[] v = new boolean[grid.length];
        int i =0;

        for (int x=0;x<grid.length;x++)
            if(!v[x])
            {
                helper(grid,x,v);

            };
    }
}
