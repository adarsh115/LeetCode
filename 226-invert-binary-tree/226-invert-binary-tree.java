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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode temp = q.remove();
            TreeNode left = temp.left;
            
            temp.left = temp.right;
            temp.right = left;
            
            if(temp.left != null)q.add(temp.left);
            if(temp.right != null)q.add(temp.right);
        }
        
        return root;
    }
}