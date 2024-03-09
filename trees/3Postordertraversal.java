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


    ///////////////////   ITERATIVE   Using Two stack,    //////////////////////////
    // public class TUF {
    //     static ArrayList < Integer > postOrderTrav(Node curr) {
    
    //         ArrayList < Integer > postOrder = new ArrayList < > ();
    //         if (curr == null) return postOrder;
    
    //         Stack < Node > s1 = new Stack < > ();
    //         Stack < Node > s2 = new Stack < > ();
    //         s1.push(curr);
    //         while (!s1.isEmpty()) {
    //             curr = s1.peek();
    //             s1.pop();
    //             s2.push(curr);
    //             if (curr.left != null)
    //                 s1.push(curr.left);
    //             if (curr.right != null)
    //                 s1.push(curr.right);
    //         }
    //         while (!s2.isEmpty()) {
    //             postOrder.add(s2.peek().data);
    //             s2.pop();
    //         }
    //         return postOrder;
    //     }


    ////////////////////////////// We can also do using one stack ///////////////////////////