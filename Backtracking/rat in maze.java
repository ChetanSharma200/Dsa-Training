class Solution {
    private static void backtrack(int[][]maze ,int row,int col,
    StringBuilder sb ,ArrayList<String> ans) {
        if(row == maze.length-1 && col == maze.length-1){
            ans.add(sb.toString());
            return;
        }
        if(row < 0 || col < 0 || row >= maze.length || col >= maze.length) {
            return ;
        }
        if(maze[row][col]==0)return;
        maze[row][col]=0;
        int [][] dir= {{1,0},{0,1},{0,-1},{-1,0}};
        char []  ch = {'D','R','L','U'};
         for(int i = 0;i<4;i++){
             int nRow = row + dir[i][0];
             int nCol = col +dir[i][1];
             sb.aappend(ch[i]);
             backtrack(maze,nRow,nCol,sb,ans);
             sb.deleteCharAt(sb.length()-1);
         }
         maze[row][col] =1;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        backtrack(maze, 0,0,new StringBuilder(),ans);
       Collections.sort(ans);
        return ans;
    }
}
