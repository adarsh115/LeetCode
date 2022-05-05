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
    static int ans, i;
    public void solve(TreeNode root, int k){
        if(root == null)return;
        
        solve(root.left, k);
        if(++i == k){ans = root.val;return;}
        solve(root.right, k );
    }
    public int kthSmallest(TreeNode root, int k) {
        ans = 0;
        i = 0;
        solve(root, k);
        return ans;
    }
}