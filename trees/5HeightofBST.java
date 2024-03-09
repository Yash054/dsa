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
    int l=0;
    public int maxDepth(TreeNode root) {
        calcmax(root,0);
        return l;
    }
    public void calcmax(TreeNode curr,int h)
    {
        if(curr==null) return;
        h++;
        if(h>l)l=h;
        calcmax(curr.left,h);
        calcmax(curr.right,h);
    }
}