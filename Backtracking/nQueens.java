class Solution {
    private static boolean isSafe(int row,int col,char [][] board){
        int nRow=row;
        int nCol =col;
        // Diagonal check
        while(nRow>=0 && nCol>=0){
            if(board[nRow][nCol] == 'Q')return false;
            nRow--;
            nCol--;
        }

        // Lower Diagonal check
        nRow =row;
        nCol = col;
        while(nRow<board.length  && nCol>=0){
            if(board[nRow][nCol] == 'Q') return false;
            nRow++;
            nCol--;
        }
        //  Row check
        nCol = col;
        
        while(nCol>=0){
            if(board[row][nCol] == 'Q') return false;
            nCol--;
        }
       return true;
    }
    public static void backtrack(int col,List<List<String>> ans,char[][]board) {
        if(col == board.length){
            List<String> list = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                list.add(new String(board[i]));
            }
           ans.add(list);
            return;
        }

        for(int row=0;row<board.length;row++){
             if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                backtrack(col+1,ans,board);
                board[row][col] ='.';
             }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char[n][n];
        for(int i =0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        backtrack(0,ans,board);
        return ans;
    }
}
