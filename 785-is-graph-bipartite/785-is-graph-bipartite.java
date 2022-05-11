class Solution {
    public boolean dfsCheck(int graph[][], int parent, int color[]){
        if(color[parent] == -1)color[parent] = 1;
        
        for(int child : graph[parent]){
            if(color[child] == -1){
                color[child] = 1-color[parent];
                
                if(dfsCheck(graph, child, color) == false)return false;
            }
            else if(color[child] == color[parent])return false;
        }
        
        return true;
    }
    public boolean bfsCheck(int graph[][], int node, int color[]){
        Queue<Integer> q = new LinkedList<>();

        color[node] = 1;     
        q.add(node);
        

        while(!q.isEmpty()){
            
            int parent = q.remove();
            
            for(int child : graph[parent]){
                
                if(color[child] == -1){
                    color[child] = 1-color[parent];
                    q.add(child);
                }
                else if(color[child] == color[parent])return false;
            }
        }
        
        return true; 
    }

    
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        
        int color[] = new int[n];
        
        Arrays.fill(color, -1);
        
        for(int i=0; i<n; i++){
            if(color[i] == -1){
                boolean ans = dfsCheck(graph, i, color);
                
                if(ans == false)return false;
            }
        }
        
        return true;
        
    }

    

}