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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)return list;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int level = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        while(!q.isEmpty()){
            int size = q.size();
            
     
            while(size-- > 0){
                TreeNode top = q.remove();

                map.put(level, top.val);
                
                if(top.left != null)q.add(top.left);
                if(top.right != null)q.add(top.right);
            }
            
            ++level;
        }
        
        list.addAll(map.values());
        return list;
        
    }
}