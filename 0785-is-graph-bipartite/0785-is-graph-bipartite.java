class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;
        int color[] = new int[n];
        
        for(int i=0; i<n; i++)color[i] = -1;
        
        for(int i=0; i<n; i++){
            if(color[i] == -1){
                if(dfs(graph, i, 0, color) == false)return false;
            }
        }
        
        return true;
    }
    
    public boolean dfs(int graph[][], int i, int col, int color[]){
        
        color[i] = col;
        
        for(int node : graph[i]){
            if(color[node] == col) return false;
            else if(color[node] == -1){
                if(dfs(graph, node, 1-col, color)==false)return false;;
            }
        }
        
        return true;
    }
}