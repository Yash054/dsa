class Solution {
    int dp[][];
   public int minimumTotal(List<List<Integer>> triangle) {
       int n = triangle.size();
       dp = new int[n][n];
       for(int[] i : dp){
           Arrays.fill(i,Integer.MIN_VALUE)   ;      
       }

       return calc(0,0,triangle);
   }

   int calc (int m,int n, List<List<Integer>> tri)
   {
       if(dp[m][n]!=Integer.MIN_VALUE) return dp[m][n];
       if(m==tri.size()-1) return tri.get(m).get(n);

       int one = tri.get(m).get(n) + calc(m+1,n,tri);
       int two = tri.get(m).get(n)  + calc(m+1,n+1,tri);

       return dp[m][n] = Math.min(one,two);       
       
   }
}