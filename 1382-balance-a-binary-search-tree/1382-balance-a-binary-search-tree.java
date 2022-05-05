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
    void inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null)return;
        
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    TreeNode solve(ArrayList<Integer> list, int s, int e){
        if(s > e)return null;
        int mid = (e+s)/2;
        
        TreeNode root = new TreeNode(list.get(mid));
        
        root.left = solve(list, s, mid-1);
        root.right = solve(list, mid+1, e);

        return root;
        
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        
        
        // TreeNode newroot = solve(list, 0, list.size()-1);
        
        // inorder(newroot, list);
        
        // System.out.print(list);
        root = solve(list, 0, list.size()-1);
        return root;
        
            
    }
}