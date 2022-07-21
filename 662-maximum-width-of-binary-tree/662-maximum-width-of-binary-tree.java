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

class pair{
    int num;
    TreeNode root;
    pair(TreeNode r, int x){
        this.root = r;
        this.num = x;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)return 0;
        
        int ans = 0;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));
        
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().num;
            int first = 0, last = 0;
            
            for(int i = 0; i<size; i++){
                int curr_num = q.peek().num - min;
                TreeNode node = q.peek().root;
                
                q.poll();
                
                if(i == 0)first = curr_num;
                if(i == size-1)last = curr_num;
                
                if(node.left != null){
                    q.add(new pair(node.left, curr_num*2+1));
                }
                if(node.right != null){
                    q.add(new pair(node.right, curr_num*2+2));
                }
            }
            ans = Math.max(ans, last-first+1);
        }
        
        return ans;
    }
}