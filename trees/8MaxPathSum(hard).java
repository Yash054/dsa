/**
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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxpath(root);
        return max;
    }
    public int maxpath(TreeNode curr)
    {
        //
        if(curr==null)
            return 0;
        int le = Math.max(maxpath(curr.left),0);// to handle case if, left node is -1, then it is better to leave the path to calc max path .
        int ri = Math.max(maxpath(curr.right),0);
        max = (int)Math.max(max,le+ri+curr.val);// measure the path in direction -  ^ 
        return  curr.val + Math.max(le,ri);// forward the max path line so eithr left or right
    


    }
}