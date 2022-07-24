class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rl=matrix.length-1;
        int cl=matrix[0].length-1;
        
        int column=0;
        
        for(int row=0;row<matrix.length;row++)
        {
            if(matrix[row][0]==target || matrix[row][cl]==target) return true;
            
            if(column<cl)
            {
                 if(matrix[0][column]==target || matrix[rl][column]==target) return true;
            }
           
            
            if(matrix[row][0]<target && matrix[row][cl]>target)
            {
                for(int i=1;i<matrix[row].length-1;i++)
                {
                    if(matrix[row][i]==target) return true;
                }
            }
            
            if(column < cl && matrix[0][column]<target && matrix[rl][column]>target)
            {
                 for(int i=1;i<matrix.length-1;i++)
                {
                    if(matrix[i][column]==target) return true;
                }
            }
            
            column++;
        }
        
        return false;
    }
}