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
//     public void preorder(TreeNode root, List<Integer> preorder){
//         if(root == null)return;
        
//         preorder.add(root.val);
//         preorder(root.left, preorder);
//         preorder(root.right, preorder);
        
//     }
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> preorder = new ArrayList<>();
        
//         preorder(root, preorder);
        
//         return preorder;
//     }
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> preorder = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            if(root == null)return preorder;
            stack.push(root);
           
            while(stack.size()>0){
                root = stack.pop();
                
                preorder.add(root.val);
                if(root.right != null)stack.add(root.right);
                if(root.left != null)stack.add(root.left);
                
            }
            
            return preorder;
    }
}