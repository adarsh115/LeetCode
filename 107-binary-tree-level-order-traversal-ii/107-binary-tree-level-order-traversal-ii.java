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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
                List<List<Integer>> zigzag = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)return zigzag;
        
        q.add(root);
        boolean flag = true;
        while(q.size() > 0){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            
            while(size > 0){
                root = q.remove();
                level.add(root.val);
                
                if(root.left != null)q.add(root.left);
                if(root.right != null)q.add(root.right);
                
                size--;
            }
            if(flag){
               zigzag.add(level); 
            }
            else{
                
                zigzag.add(level); 
            }
            flag = !flag;
        }
        Collections.reverse(zigzag);
        return zigzag;
    }
}