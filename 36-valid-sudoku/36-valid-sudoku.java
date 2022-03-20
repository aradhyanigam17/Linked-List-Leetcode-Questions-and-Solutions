class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i =0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.' &&  !isSafe(board,i,j,board[i][j]))
                    return false;
                    
            }
        }
        return true;
    }
    public boolean isRowSafe(char[][] board,int row,int column,char num)
    {
        for(int i =0;i<9;i++)
        {
            if(num==board[row][i] && i!=column)
                return false;
        }
        return true;
    }
    
    public boolean isColumnSafe(char[][] board,int row,int column,char num)
    {
        for(int i =0;i<9 ;i++)
        {
            if(num==board[i][column] && i!=row)
                return false;
        }
        return true;
    }
    
    public boolean isBoxSafe(char[][] board,int row,int column,char num)
    {
        int cRow = row - row%3;
        int cColumn = column - column%3;
        
        for(int i=cRow;i<cRow+3;i++)
        {
            for(int j=cColumn;j<cColumn+3;j++)
            {
                if(num==board[i][j] && i!=row && j!=column)
                    return false;
            }
        }
        return true;
    }
    
    public boolean isSafe(char[][] board,int row,int column,char num)
    {
        return isRowSafe(board,row,column,num) && isColumnSafe(board,row,column,num) && isBoxSafe(board,row,column,num);
    }
}
