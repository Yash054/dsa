// class Solution {
//     public int findCircleNum(int[][] isConnected) {
//         Map<Integer,List<Integer>> graph = makegraph(isConnected);
//         boolean marked[] = new boolean[isConnected.length];
//         int count = 0 ; 
//         for(int i =0;i<isConnected.length;i++)
//         {
//             if(marked[i]==true)
//                 continue;
//             dfs(i,graph,marked);
//             count++;
//         }
//             return count;
//     }


//     public void dfs(int i, Map<Integer,List<Integer>> g, boolean []marked)
//     {
//         marked[i]=true;
//         List<Integer> next = g.get(i);
//         for(int n : next)
//         {
//            if(!marked[n])
//                 dfs(n,g,marked); 
//         }
//     }

//     public Map<Integer,List<Integer>> makegraph(int[][] isConnected)
//     {
//         Map<Integer,List<Integer>> newg = new HashMap<>();
//         for(int i = 0;i<isConnected.length;i++)
//         {
//            newg.put(i,new ArrayList<>());
//         }
//         for(int i = 0;i<isConnected.length;i++)
//         {
//             for(int j=0;j<isConnected.length;j++)
//             {
//                 if(isConnected[i][j]==1)
//                 newg.get(i).add(j);
//             }
//         }
//         return newg;
//     }
// }

class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] vis=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                dfs(vis,isConnected,i);
                count++;
            }
        }
        return count;
    }

    public void dfs(boolean[] vis,int isConnected[][],int v){
        vis[v]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[v][i] == 1 && vis[i]==false){
                dfs(vis,isConnected,i);
            }
        }
    }
}s