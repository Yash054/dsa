package trees;

public /**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode() {}
*     TreeNode(int val) { this.val = val; }
*     TreeNode(int val, TreeNode left, TreeNode right) {
*         this.val = val;
*         this.left = left;
*         this.right = right;
*     }
* }
*/
class Solution {

   int max =0;
   public int diameterOfBinaryTree (TreeNode root){

       calcdiameter(root);
       //if(x>max) return x;
       return max;
       
   }

   public int calcdiameter(TreeNode curr)
   {

       if(curr==null)
       return 0;
       int l =calcdiameter(curr.left);
       int r = calcdiameter(curr.right);
       //System.out.println(l+" "+r);
       max=max<l+r?l+r:max;
       return l<r?r+1:l+1;

           }

} {
    
}
