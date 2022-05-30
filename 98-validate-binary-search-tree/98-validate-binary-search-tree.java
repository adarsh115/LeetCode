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
    public boolean solve(TreeNode root, int lb, int ub){
        if(root == null)return true;
        
        if(!(root.val <= ub && root.val >= lb))return false;
        
        boolean left = solve(root.left, lb, root.val);
        boolean right = solve(root.right, root.val, ub);
            
        return left && right;
    }
        private boolean dfs(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        if ((min != null && root.val <= min) || max != null && root.val >= max) {
            return false;
        }

        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);

    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }
}