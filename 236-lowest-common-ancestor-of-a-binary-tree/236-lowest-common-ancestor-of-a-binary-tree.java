/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode solve(TreeNode root, TreeNode p, TreeNode q){
        if(root == null)return null;
        if(root.val == p.val || root.val == q.val)return root;
        
        TreeNode left = solve(root.left, p, q);
        TreeNode right = solve(root.right, p, q);
        
        if(left != null && right != null)return root;
        else if(left == null && right != null)return right;
        else if(left != null && right == null)return left;
        else return null;      
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return solve(root, p, q);
    }
}