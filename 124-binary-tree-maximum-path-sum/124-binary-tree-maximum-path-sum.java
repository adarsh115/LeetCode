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
    int maxpath = Integer.MIN_VALUE;
    
    public int solve(TreeNode root){
        if(root == null)return 0;
        
        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));
        
        maxpath = Math.max(maxpath, left+right+root.val);
        
        return Math.max(left,right)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        if(root == null)return 0;
        
        solve(root);
        
        return maxpath;
    }
}