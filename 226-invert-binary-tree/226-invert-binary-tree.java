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
    public TreeNode solve(TreeNode root){
        if(root == null)return  null;
        TreeNode left = solve(root.left);
        TreeNode right = solve(root.right);
        
        root.left = right;
        root.right = left;
        
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null || root.right == null && root.left == null)return root;
        solve(root);
        
        return root;
    }
}