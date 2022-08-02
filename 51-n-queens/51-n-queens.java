class Solution {
    public void fun(char[][] board,List<List<String>> list,int col,int n)
    {
        if(col==n)
        {
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                temp.add(new String(board[i]));
            }
            
            list.add(temp);
            return;
        }
        
        for(int i=0;i<n;i++)
        {
            if(check(board,i,col))
            {
                board[i][col]='Q';
                fun(board,list,col+1,n);
                board[i][col]='.';
            }
        }
        
        return;
    }
    public boolean check(char[][] board,int r,int c)
    {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < c; j++) {
                if(board[i][j] == 'Q' && (r + j == c + i || r + c == i + j || r == i))
                    return false;
            }
        }
        
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list=new ArrayList<>();
        char[][] board=new char[n][n];
        
        for(char[] x:board)
        Arrays.fill(x,'.');
        
        fun(board,list,0,n);
        return list;
        
    }
}