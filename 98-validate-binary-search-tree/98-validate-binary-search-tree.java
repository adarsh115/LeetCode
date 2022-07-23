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
    //     private boolean helper(TreeNode root, long min, long max){
    //   if(root == null) return true;
    //   boolean isLeftValid = helper(root.left, min, root.val);
    //   boolean isRightValid = helper(root.right, root.val, max);
    //   return root.val < max && root.val > min && isLeftValid && isRightValid;
    // }
    public boolean solve(TreeNode root, long floor, long ceil){
        if(root == null)return true;
        
        boolean left = solve(root.left, floor, root.val);
        boolean right = solve(root.right, root.val, ceil);
        
        
        return root.val < ceil && root.val > floor && left && right;

    }
    public boolean isValidBST(TreeNode root) {
        return solve(root, Long.MIN_VALUE, Long.MAX_VALUE);
        // return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}