class Solution {
    int cr;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        cr=image[sr][sc];
        flood(image,sr,sc,color);
        return image;
    }
    public void flood(int[][] image, int sr, int sc, int color){
        if(image[sr][sc]!=color){
            //System.out.println(sr+" "+sc);
            image[sr][sc]=color;
        if(sr>0 && cr==image[sr-1][sc])
        { 
           flood(image,sr-1,sc,color);
        }
        if(sr<image.length-1 && cr==image[sr+1][sc])
        {
           // image[sr][sc]=color; 
            flood(image,sr+1,sc,color);
        }
        if(sc>0 && cr==image[sr][sc-1])
        {
            //image[sr][sc]=color; 
            flood(image,sr,sc-1,color);
        }
        if(sc<image[0].length-1 && cr==image[sr][sc+1])
        {
           // image[sr][sc]=color; 
            flood(image,sr,sc+1,color);
        }
                   }
    }
}