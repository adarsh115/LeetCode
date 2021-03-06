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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root == null)return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            int temp = size;
            
            double avgSum = 0;
            
            double sum = 0;
            
            while(temp-- > 0 ){
                TreeNode node = q.remove();
                sum += node.val;
                if(node.left != null)q.add(node.left);
                if(node.right != null)q.add(node.right);
            }
            avgSum = sum/size;
            
            list.add(avgSum);
        }
        
        return list;
    }
}