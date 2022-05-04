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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return root;
        
        if(root.val == key){
            
            if(root.right == null)root = root.left;
            else{
                TreeNode leftSubTree = root.left;
                
                root = root.right;
                TreeNode temp = root;
                
                while(temp.left != null)temp = temp.left;
                
                temp.left = leftSubTree;
            }
            
        }
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else {
            root.right = deleteNode(root.right, key);
        }
        
        return root;
    }
}