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
    
    public TreeNode solve(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, HashMap<Integer, Integer> map){
        if(ps > pe || is > ie)return null;
        
        TreeNode node = new TreeNode(postorder[pe]);
        
        int current = map.get(postorder[pe]);
        int preNext = current-is;
        
        node.left = solve(inorder, is, current-1, postorder, ps,  ps+preNext-1,  map);
        node.right = solve(inorder, current+1, ie, postorder, ps + preNext,  pe-1,  map);

        
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        if(n == 0)return null;
        if(n == 1)return new TreeNode(inorder[0]);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(inorder[i], i);
        }
        return solve(inorder, 0, n-1, postorder, 0, n-1, map);
    }
}