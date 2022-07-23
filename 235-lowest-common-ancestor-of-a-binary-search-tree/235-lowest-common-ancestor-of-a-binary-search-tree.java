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
    public TreeNode solve(TreeNode root, TreeNode small, TreeNode large){
        if(root== null)return null;
        if(root == small || root == large)return root;        
        
        if(small.val < root.val && large.val > root.val)return root;
      
        TreeNode left = solve(root.left, small, large);
        TreeNode right = solve(root.right, small, large);
        
        if(left == null && right == null)return null;
        
        if(left==null)return right;
        if(right == null)return left;
        
        return root;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode smaller = p.val > q.val ? q : p;
        TreeNode larger = smaller.val == p.val ? q : p;
        return solve(root, smaller, larger);
    }
}