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
    List<List<Integer>> order = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        orda(root,1);
        return order;
    }

    public void orda(TreeNode curr, int l)
    {
        if(curr == null )
        {
            return;
        }
        else
        {
            if(order.size()<l)
            {
                order.add(new ArrayList<>());
            }
            //order.get(l-1).add(curr.val);
            if(l%2==0)
            {
                order.get(l-1).add(0,curr.val);
            }
            else
            {
                order.get(l-1).add(curr.val);
            }
            orda(curr.left,l+1);
            orda(curr.right,l+1);
        }
    }
}