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
    public TreeNode invertTree(TreeNode node) {
        if(node == null)return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            TreeNode root = q.remove();
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            
            if(root.left != null)q.add(root.left);
            if(root.right != null)q.add(root.right);
        }
        
        
        return node;
    }
}

