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


////////////////////////////////////////

for (int i = 0; i < n; i++) {
    LinkedList<Integer> row = new LinkedList<>();

    // Fill each row with the value 6
    for (int j = 0; j <= i; j++) {
        row.add(6);
    }

    // Add the row to the triangle
    triangle.add(row);
}

triangle.get(i).set(j,value);

///// use this syntax to create a dp list instead of dp array
