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
    int max = Integer.MIN_VALUE;
    
    public int solve(TreeNode root){
        if(root == null)return 0;
        
        int left = solve(root.left);
        int right = solve(root.right);
        
        int diameter = left+right;
        max = Math.max(max, diameter);
        
        return 1 + Math.max(left, right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        // max = Integer.MIN_VALUE;
        solve(root);
        
        return max;
    }
}