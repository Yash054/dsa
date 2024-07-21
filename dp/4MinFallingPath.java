class Solution {
    int[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        dp= new int[n][n];

        for(int[] r : dp){
            Arrays.fill(r, Integer.MAX_VALUE);
        }
        int min=Integer.MAX_VALUE;
        for(int j=0 ;j<n; j++){

            int m = calc(0,j,matrix);
            if(m<min) min = m;

        } 
        return min;
    }

    int calc(int m, int n, int[][] mat)
    {
        if(dp[m][n]!=Integer.MAX_VALUE) return dp[m][n];
        if(m==mat.length-1) return mat[m][n];
        int l= Integer.MAX_VALUE;
        int c= Integer.MAX_VALUE;
        int r= Integer.MAX_VALUE;
        if(n>0) l = mat[m][n] + calc(m+1,n-1,mat); 
        if(n<mat.length-1) r = mat[m][n] + calc(m+1,n+1,mat); 
         c = mat[m][n] + calc(m+1,n,mat); 

         return dp[m][n] = Math.min(l,Math.min(r,c));
    }
}