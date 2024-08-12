class Solution {
    int m,n;

    public int numberOfIslands(int[][] grid){
        int islands =0;
        boolean[][] vis = new boolean[m][n];
        for(boolean[] r : vis){
            Arrays.fill(r,false);
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]==false){
                    DFS(grid,vis,i,j);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void DFS(int[][] grid, boolean[][] vis , int i,int j){
        if(i<0 || j<0 ||i>=m || j>=n || grid[i][j]==0 || vis[i][j]==true)
         return ;
        vis[i][j] = true;
        DFS(grid,vis,i+1,j);
        DFS(grid,vis,i,j+1);
        DFS(grid,vis,i-1,j);
        DFS(grid,vis,i,j-1);
    }



    public int minDays(int[][] grid) {
         m = grid.length;
         n = grid[0].length;

        int islands = numberOfIslands(grid);
        System.out.println(islands);
        if(islands>1||islands==0){
            return 0;
        }

        else {
            for(int i = 0;i<m;i++){
                for(int j = 0;j<n;j++){
                    if(grid[i][j]==1){
                        grid[i][j] = 0;
                        islands = numberOfIslands(grid);
                        if(islands>1||islands==0){
                           return 1;
                        }
                        grid[i][j]=1;
                    }
                }
            }
        
        }
        return 2;

    }
}