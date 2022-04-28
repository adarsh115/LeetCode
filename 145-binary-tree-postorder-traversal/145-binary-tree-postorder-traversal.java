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
//     public void postorder(TreeNode root, List<Integer> postorder){
//         if(root == null)return;
        
//         postorder(root.left, postorder);
//         postorder(root.right, postorder);
//         postorder.add(root.val);
//     }
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
        
//         postorder(root, ans);
        
//         return ans;
//     }
     public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
         Stack<TreeNode> stack1 = new Stack<>();
         Stack<Integer> stack2 = new Stack<>();
         
         if(root == null)return ans;
         stack1.add(root);
         
         while(stack1.size() > 0){
             root = stack1.pop();
             stack2.add(root.val);
             
             if(root.left != null)stack1.add(root.left);
             if(root.right != null)stack1.add(root.right);
         }
         
         while(stack2.size()>0){
             ans.add(stack2.pop());
         }
         
         return ans;
    }
}
