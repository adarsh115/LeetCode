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
        
        if(root.val < small.val && root.val < large.val){
            return solve(root.right, small, large);
        }
        else if(root.val > small.val && root.val > large.val){
            return solve(root.left, small, large);
        }
        
        return root;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return solve(root, p ,q);
    }
}