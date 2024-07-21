class Solution {
    int dp[][];
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        
        dp = new int[m][n];

        for(int[] row :dp )
        {
            Arrays.fill(row,-1);
        }

        return calc(m-1,n-1,grid);
    }

    int calc(int m, int n , int[][] grid){
        if(m==0 && n==0 ) return grid[0][0];
        if(dp[m][n]!=-1) return dp[m][n];

        int left =Integer.MAX_VALUE;int up =Integer.MAX_VALUE;
        if(n>0)  left = grid[m][n] + calc(m,n-1,grid);
        if(m>0)  up = grid[m][n] + calc(m-1 ,n,grid);

        return dp[m][n] = Math.min(left,up);

    }
}