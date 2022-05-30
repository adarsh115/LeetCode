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
    int index;

    public TreeNode solve(int[] preorder, int[] inorder, int s, int e, int l){
        if(s > e || index >= l)return null;
        
        int rootElement = preorder[index++];
        TreeNode root = new TreeNode(rootElement);
        
        int position = 0; // Index of current root in inorder
        for (int i = s; i <= e; i++) {
            if (inorder[i] == rootElement) {
                position = i;
            }
        }
        
        root.left = solve(preorder, inorder, s, position-1, l);
        root.right = solve(preorder, inorder, position+1, e,  l);
        
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n  = preorder.length;
        index =  0;
        return solve(preorder, inorder, 0, n-1, n);
    }
}