class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int rStart=0,rEnd=n-1,cStart=0,cEnd=n-1;
        int i=0;
        
        while(rStart<rEnd && cStart<cEnd)
        {
            
        while((cStart+i)<cEnd)
        {
            int temp=matrix[rStart][cStart+i];
            
            matrix[rStart][cStart+i]=matrix[rEnd-i][cStart];
            matrix[rEnd-i][cStart]=matrix[rEnd][cEnd-i];
            matrix[rEnd][cEnd-i]=matrix[rStart+i][cEnd];
            matrix[rStart+i][cEnd]=temp;
            i++;
        }
        
            rStart++;
            rEnd--;
            cStart++;
            cEnd--;
            i=0;
            
        }

    }
}
