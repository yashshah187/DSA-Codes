class Solution {
    public int fun(int i,int j,int m,int n,int[][] dp)
    {
        if(i==n && j==m)
        {
            return 1;
        }
        
        if(i>n || j>m) return 0;
        
        if(dp[i][j]!=0) return dp[i][j];
        else
        return dp[i][j]= fun(i+1,j,m,n,dp)+fun(i,j+1,m,n,dp);
        
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[n][m];
        return fun(0,0,m-1,n-1,dp);
    }
}