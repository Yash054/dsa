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



// There is a method to balance the bst in which we start from bottom of the tree and calclate the l,r and diff values, 

 class Solution {
    public boolean isBalanced(TreeNode root) {
        int x= calcmax(root);
        if(x==-1) 
        return false;
        else 
        return true;
    }
    public int calcmax(TreeNode curr)
    {

        if(curr==null)
             return 0;
        int le = calcmax(curr.left);
        int ri = calcmax(curr.right);
        int diff = (int)Math.abs(le-ri);

        if(diff>1 || le==-1 || ri==-1)//If -1 is comming from left or right side of the tree, carry it forward to the parent node , so that anser is tranfered
         return -1;
        else
         return 1+(int)Math.max(le,ri);// we pass one plus max(left and right ) value;

    }
}