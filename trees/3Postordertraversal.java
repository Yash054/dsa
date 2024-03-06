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
    LinkedList<Integer> st = new LinkedList<Integer>();

    public void postoda(TreeNode curr)
    {
        if (curr == null)
            return;
        postoda(curr.left);
        postoda(curr.right);
        st.add(curr.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        postoda(root);
        return st;
    }
    }
