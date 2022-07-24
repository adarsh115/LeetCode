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
    HashSet<Integer> set;
    boolean flag = false;
    public void solve(TreeNode root, int k){
        if(root == null)return;
        
        solve(root.left, k);
        if(set.contains(k - root.val)){
            flag = true;
            return;
        }
        set.add(root.val);
        solve(root.right, k);
        
    }
    public boolean findTarget(TreeNode root, int k) {
        this.set = new HashSet<>();
        
        solve(root, k);
        
        return flag;
    }
}