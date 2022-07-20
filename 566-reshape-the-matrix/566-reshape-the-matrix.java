class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c) return mat;
        
        int[][] ans=new int[r][c];
        int row=0,col=0;
        for(int i=0;i<r*c;i++)
        {
            ans[row][col]=mat[i/mat[0].length][i%mat[0].length];
            col++;
            
            if(col==c)
            {
                col=0;
                row++;
            }
        }
        
        
        return ans;
        
    }
}