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
    public int findMaxPath(TreeNode root, int [] arr){
        if(root == null)return 0;
        
        int leftSum = Math.max(0,findMaxPath(root.left, arr));
        int rightSum = Math.max(0,findMaxPath(root.right, arr));
        
        int PathSum = leftSum + rightSum + root.val;
        arr[0] = Math.max(arr[0], PathSum);
        
        return root.val + Math.max(leftSum, rightSum);
    }
    public int maxPathSum(TreeNode root) {
        int maxi[] = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        findMaxPath(root, maxi);
        return maxi[0];
    }
}