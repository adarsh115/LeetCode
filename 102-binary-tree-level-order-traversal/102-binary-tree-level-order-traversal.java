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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lo = new ArrayList<>();
        if(root == null)return lo;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            List<Integer> level = new ArrayList<>();
            while(size-- > 0){
                TreeNode top = q.remove();
                level.add(top.val);
                
                if(top.left != null)q.add(top.left);
                if(top.right != null)q.add(top.right);
            }
            
            lo.add(level);
        }
        
        return lo;
    }
}