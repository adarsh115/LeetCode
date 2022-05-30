/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)return "N";
        
        return root.val + "," + serialize(root.left)+ "," + serialize(root.right);
    }
    
     public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return solve(queue);
    }
    
    private TreeNode solve(Queue<String> queue) {
        String s = queue.poll();
        if (s.equals("N")) return null;
       
        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = solve(queue);
        root.right = solve(queue);
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));