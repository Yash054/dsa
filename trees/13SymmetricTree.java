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
    boolean b = true;
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        check(root.left,root.right);
        return b;
    }

    public void check(TreeNode l , TreeNode r)
    {
        if(r==null && l==null)
        {
            return;
        }
        if(l==null || r==null )
        {
            b=false;
            return;
        }
        if(l.val==r.val)
        {
            check(l.left,r.right);
            check(l.right,r.left);
        }
        else
        {
            b=false;
            return;
        }
    }
}