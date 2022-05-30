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
    int height_difference = Integer.MIN_VALUE;
    int solve(TreeNode root){
        if(root == null)return 0;
        
        int left = solve(root.left);
        int right = solve(root.right);
        
        height_difference = Math.max(height_difference, Math.abs(left - right));
        
        
        return 1 + Math.max(left, right);
    }
    public boolean isBalanced(TreeNode root) {
        // height_difference = Integer.MIN_VALUE;
            
        solve(root);
        // System.out.print(height_difference);
        return !(height_difference > 1);
    }
}