class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        for(int[] row: dp)
        Arrays.fill(row,-1);
        return calc(m-1,n-1);


    }
    int calc(int m, int n)
    {
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;

        if(dp[m][n]!=-1) return dp[m][n];

        int left= calc(m,n-1);
        int right= calc(m-1,n);

        return dp[m][n]=left+right;

    }
}