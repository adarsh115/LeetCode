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
    public void preorder(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
    public void flatten(TreeNode root) {
        if(root == null)return;
        ArrayList<Integer> list = new ArrayList<>();
        preorder(root, list);
        
        // System.out.print(list);
        
        TreeNode rt = new TreeNode(list.get(0));
        TreeNode curr = root;
        
        for(int i=1; i<list.size(); i++){
            TreeNode temp = new TreeNode(list.get(i));
            curr.right = temp;
            curr.left = null;
            curr = temp;
            // System.out.print(rt.val + " " + "rt");
        }
        curr.left = null;
        curr.right = null;
        
        root = curr;
    }
}