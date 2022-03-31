class Solution {
    public int[][] generateMatrix(int n) {
       int[][] matrix=new int[n][n];
        
        int rowStart=0,colStart=0;
        int rowEnd=matrix.length-1,colEnd=matrix[0].length-1;
     
        int temp=1;
        while(true)
        {
            if(colStart>colEnd) break;
            for(int i=colStart;i<=colEnd;i++)
            {
                matrix[rowStart][i]=temp++;
            }
            rowStart++;
            
             if(rowStart>rowEnd) break;
            
            
            for(int i=rowStart;i<=rowEnd;i++)
            {
                matrix[i][colEnd]=temp++;
            }
            colEnd--;
            
           if(colStart>colEnd) break;
            
            for(int i=colEnd;i>=colStart;i--)
            {
                matrix[rowEnd][i]=temp++;
            }
            rowEnd--;
            
             if(rowStart>rowEnd) break;
            
            
            for(int i=rowEnd;i>=rowStart;i--)
            {
                matrix[i][colStart]=temp++;
            }
            colStart++;
            
        }
        
        return matrix;
    }
}