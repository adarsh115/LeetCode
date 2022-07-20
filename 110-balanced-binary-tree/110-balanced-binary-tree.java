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
    public int solve(TreeNode root){
        if(root == null)return 0;
        
        int left = solve(root.left);
        int right = solve(root.right);
        
        if(left == -1 || right == -1)return -1;
        // System.out.println(left + " " + right);
        if(Math.abs(left - right) > 1)return -1;
        
        return Math.max(left, right) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        System.out.print(solve(root));
        if(solve(root) == -1)return false;
        return true;
    }
}