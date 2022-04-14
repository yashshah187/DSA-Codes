class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
        
    List<Character> list=new ArrayList<>();
       
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(list.contains(board[i][j]))
                {
                    if(board[i][j]!='.')
                        return false;
                    
                   
                }
                 list.add(board[i][j]);
                
                    
            }
            list.clear();
        }
        
         for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(list.contains(board[j][i]))
                {
                    if(board[j][i]!='.')
                        return false;
                    
                   
                }
                 list.add(board[j][i]);
                    
            }
            list.clear();
        }
         
        
        int row=0,col=0;
        while(row<board.length)
        {
        for(int i=row;i<row+3;i++)
        {
            for(int j=col;j<col+3;j++)
            {
                if(list.contains(board[i][j]))
                {
                    if(board[i][j]!='.')
                        return false;
                    
                   
                }
                 list.add(board[i][j]);
                
                    
            }
            
        
        }
            System.out.println(list);
            col+=3;
            list.clear();
            
            if(col==board[0].length)
            {
                col=0;
                row+=3;
            }
        }
        
        return true;
    }
}