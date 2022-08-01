class Solution {
    
    public int fun(int[][] grid, int i,int j,int r,int c,int[][] dp)
    {
        if(i==r && j==c) 
        {
            if(grid[i][j]==1) return 0;
            else return 1;
        }
        
        if(i>r || j>c) return 0;
        
        if(grid[i][j]==1) return 0;
        
        if(dp[i][j]!=0) return dp[i][j];
        else
        return dp[i][j]=fun(grid,i,j+1,r,c,dp) + fun(grid,i+1,j,r,c,dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length-1;
        int c=obstacleGrid[0].length-1;
        
        int[][] dp=new int[r+1][c+1];
        
       return fun(obstacleGrid,0,0,r,c,dp);
        
    }
}