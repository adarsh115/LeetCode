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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if(n == 0)return null;
        if(n ==1)return new TreeNode(preorder[0]);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n ;i++){
            map.put(inorder[i], i);
        }
        
        return solve(preorder, 0, n-1, inorder, 0, n-1, map);
    }
    
    public TreeNode solve(int[] preorder, int ps, int pe, int[] inorder, int is, int ie, HashMap<Integer, Integer> map){
        if(ps > ps || is > ie)return null;
        
        TreeNode node  = new TreeNode(preorder[ps]);
        
        
        
        int currentIndex = map.get(preorder[ps]);
        int preNext = currentIndex - is;
        
        
        
        node.left = solve(preorder, ps+1, ps+preNext, inorder, is, currentIndex-1, map);
        node.right = solve(preorder, ps+preNext+1, pe, inorder, currentIndex+1, ie, map);
        
        return node;
        
 
        
    }

}