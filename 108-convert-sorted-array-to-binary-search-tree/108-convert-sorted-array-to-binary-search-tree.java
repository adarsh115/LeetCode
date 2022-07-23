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
    public TreeNode insert(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        
        if(root.val > val){
            root.left  = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        
        return root;
    }
    
    public TreeNode solve(int nums[], int left, int right){
        if(left > right)return null;
        
        int mid = (left + right)/2;
        
        TreeNode node = new TreeNode(nums[mid]);
        node.left = solve(nums, left, mid-1);
        node.right = solve(nums, mid+1, right);
        
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)return null;
        if(nums.length == 1)return new TreeNode(nums[0]);
        
        int n = nums.length;
        TreeNode root = null;
        
        root = solve(nums, 0, n-1);

        return root;

    }
}