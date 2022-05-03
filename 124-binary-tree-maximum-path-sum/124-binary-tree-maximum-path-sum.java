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
    int solve(TreeNode root, int max[]){
        if(root == null)return 0;
        
        int left = Math.max(0, solve(root.left, max));
        int right = Math.max(0, solve(root.right, max));
        
        int path = root.val + left + right;
        max[0] = Math.max(max[0], path);
        
        return root.val + Math.max(left, right);
    }
    public int maxPathSum(TreeNode root) {
        
        int ans[] = new int[1];
        ans[0] = Integer.MIN_VALUE;
        solve(root, ans);
        
        return ans[0];
    }
}