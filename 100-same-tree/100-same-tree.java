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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q != null || p != null && q == null)return false;
        
        if(p == null && q == null)return true;
        Queue<TreeNode> same = new LinkedList<>();
        
        same.add(p);
        same.add(q);
        
        while(!same.isEmpty()){
        
            TreeNode first = same.remove();
            TreeNode second = same.remove();
            
            if(first.val != second.val)return false;
            if(first.left != null && second.left == null || first.left == null && second.left != null)return false;
            if(first.right != null && second.right == null || first.right == null && second.right != null)return false;
            
            if(first.left != null && second.left != null){
                same.add(first.left);
                same.add(second.left);
            }

            
            if(first.right != null && second.right != null){
                same.add(first.right);
                same.add(second.right);
            }

        }
        
        return true;
    }
}