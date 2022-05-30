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
    int good = 0;
    public void solve(TreeNode root, int highest_ancestor){
        if(root == null)return;
        
        if(root.val >= highest_ancestor)good++;
        
        highest_ancestor = Math.max(root.val, highest_ancestor);
        
        solve(root.left, highest_ancestor);
        solve(root.right, highest_ancestor);
    }
    public int goodNodes(TreeNode root) {
        // good = 0;
        solve(root, Integer.MIN_VALUE);
        
        return good;
    }
}