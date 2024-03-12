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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        compute(root,0);
        return sum;
    }
    public void compute(TreeNode curr, int s)
    {
        if(curr.left==null && curr.right==null)
        {
            s=s*10+curr.val;
            //System.out.print(s+" ");
            sum+=s;
            return;
        }
        if(curr.left==null)
        {
            s=s*10+curr.val;
            compute(curr.right,s);
            return;
        }
        if(curr.right==null)
        {
            s=s*10+curr.val;
            compute(curr.left,s);
            return;
        }

        s=s*10+curr.val;
        compute(curr.left,s);
        compute(curr.right,s);
    }
}