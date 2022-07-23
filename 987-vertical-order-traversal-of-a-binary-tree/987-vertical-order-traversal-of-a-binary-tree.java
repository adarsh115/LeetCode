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

class Tuple{
    int vertical;
    int level;
    TreeNode node;
    Tuple(int x ,int y, TreeNode n){
        this.vertical = x;
        this.level = y;
        this.node = n;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer> >> map = new TreeMap<>();
        
        Queue<Tuple> q = new LinkedList<>();
        
        q.add(new Tuple(0, 0, root));
        
        while(!q.isEmpty()){
            
            Tuple current = q.remove();
            
            int x = current.vertical;
            int y = current.level;
            TreeNode node = current.node;
            
            if(!map.containsKey(x)){
                map.put(x, new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y, new PriorityQueue<>());
            }
            
            map.get(x).get(y).add(node.val);
            
            if(node.left != null){
                q.add(new Tuple(x-1, y+1, node.left));
            }
            if(node.right != null){
                q.add(new Tuple(x+1, y+1, node.right));
            } 
        }
        
        System.out.print(map);
        
        List<List<Integer>> ans  = new ArrayList<>();
        
        for(TreeMap<Integer, PriorityQueue<Integer>> mp : map.values()){
            List<Integer> list = new ArrayList<>();
            for(PriorityQueue<Integer> p : mp.values()){
                
                while(!p.isEmpty()){
                    list.add(p.remove());
                }
            }
            
            ans.add(list);
        }
        
        
        return ans;
    }
}