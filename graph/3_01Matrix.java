// class Pair{
//     int i;
//     int j;
//     Pair(int i, int j)
//     {
//         this.i=i;
//         this.j=j;
//     }
// }
// class Solution {
    
//     public int[][] updateMatrix(int[][] mat) {
//         for(int i=0;i<mat.length;i++)
//         {
//             for(int j = 0;j<mat[0].length;j++)
//             {
//                 Queue<Pair> li = new LinkedList<>();
//                 li.add(new Pair(i,j));
//                 bfs(mat,i,j,li,0);
//             }
//         }
//         return mat;
//     }

//     public void bfs(int[][] mat, int r,int c, Queue<Pair> li,int co)
//     {
//         int cou=0;
//        // if(li.isEmpty())
//       // return;
//         Pair n= li.remove();
//         //System.out.println(n.i+" "+n.j);
//         if(mat[n.i][n.j]==0)
//             {
//                 mat[r][c]=co;
//                 return;
//             }
//         if(n.i>0)
//         { 
//            li.add(new Pair(n.i-1,n.j));
//            cou++;
//         }
//         if(n.i<mat.length-1)
//         {
//             li.add(new Pair(n.i+1,n.j));
//             cou++;
//         }
//         if(n.j>0)
//         {
//             li.add(new Pair(n.i,n.j-1));
//             cou++;
//         }
//         if(n.j<mat[0].length-1)
//         {
//            li.add(new Pair(n.i,n.j+1));
//            cou++;
//         }
//         while(cou>=0)
//         {
//             bfs(mat,r,c,li,co+1);
//             cou--;
//         }

//     }
// }

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0)
            return new int[0][0];

        int m = mat.length, n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int MAX_VALUE = m * n;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    mat[i][j] = MAX_VALUE;
                }
            }
        }
        
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] dir : directions) {
                int r = cell[0] + dir[0], c = cell[1] + dir[1];
                if (r >= 0 && r < m && c >= 0 && c < n && mat[r][c] > mat[cell[0]][cell[1]] + 1) {
                    queue.offer(new int[]{r, c});
                    mat[r][c] = mat[cell[0]][cell[1]] + 1;
                }
            }
        }
        
        return mat;
    }
}