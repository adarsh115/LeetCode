class Solution {
    public int findCenter(int[][] edges) {
        int nodes[]  = new int[edges.length+1];
        
        for(int edge[]: edges){
            int first_node = edge[0];
            int second_node = edge[1];
            
            nodes[first_node-1]++;
            nodes[second_node-1]++;
        }
        
        int max = 0;
        int node = -1;
        for(int i = 0; i<nodes.length; i++){
            if(nodes[i] > max){
                max = nodes[i];
                node = i+1;
            }
        }
        
        return node;
    }
}