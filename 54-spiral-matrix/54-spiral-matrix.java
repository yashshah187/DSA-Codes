class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart=0,colStart=0;
        int rowEnd=matrix.length-1,colEnd=matrix[0].length-1;
        
        List<Integer> list=new ArrayList<>();
        
        while(true)
        {
            if(colStart>colEnd) break;
            for(int i=colStart;i<=colEnd;i++)
            {
                list.add(matrix[rowStart][i]);
            }
            rowStart++;
            
             if(rowStart>rowEnd) break;
            
            
            for(int i=rowStart;i<=rowEnd;i++)
            {
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            
           if(colStart>colEnd) break;
            
            for(int i=colEnd;i>=colStart;i--)
            {
                list.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            
             if(rowStart>rowEnd) break;
            
            
            for(int i=rowEnd;i>=rowStart;i--)
            {
                list.add(matrix[i][colStart]);
            }
            colStart++;
            
        }
        
        return list;
    }
}