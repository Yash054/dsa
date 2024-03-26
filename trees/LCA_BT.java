import javax.swing.tree.TreeNode;

public /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LCA_BT {
    public TreeNode lowestCommonAncestor(TreeNode curr, TreeNode p, TreeNode q) {
        if(curr == null ||  curr == p || curr==q )//this prevent recurssion to dive deep into treee and evaluatuing only from where target node is identified
        {
            return curr;// rturns p , q, or null
        }
        else{
            
            
            TreeNode left = lowestCommonAncestor( curr.left , p ,q );
            TreeNode right = lowestCommonAncestor( curr.right , p ,q );
            if(left==null)
                return right;
            if(right==null)
                return left;
            
            return curr;
            
        }
    }
} {
    
}
