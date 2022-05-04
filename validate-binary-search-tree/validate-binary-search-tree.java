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
    public boolean isValidBST(TreeNode root) {
        if(root == null || (root.left ==  null && root.right == null))return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.add(root);
                root = root.left;
            }
            
            root = stack.peek();
            stack.pop();
            
            if(prev != null && prev.val >= root.val){
                return false;
            }
            
            prev = root;
            root = root.right;
        }
        
        return true;
    }
}