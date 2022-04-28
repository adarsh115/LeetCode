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
//         if(p == null &&  q == null)return true;
//         if(p == null || q == null)return false;
       
//         return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(p);
        qu.add(q);
        
        while(qu.size()>0){
            p = qu.remove();
            q = qu.remove();
            
            if(p == null && q == null)continue;
            else if (q == null || p == null || p.val != q.val)return false;
            
            qu.add(p.left);
            qu.add(q.left);
            qu.add(p.right);
            qu.add(q.right);
        }
        
        return true;
    }
}
