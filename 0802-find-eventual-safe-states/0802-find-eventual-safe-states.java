class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        
        boolean visited[] = new boolean[n];
        boolean dfsVisited[] = new boolean[n];
        boolean cycleP[] = new boolean[n];
        
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i, graph, visited, dfsVisited, cycleP);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(!cycleP[i]){
                list.add(i);
            }
        }
        
        return list;
    }
    
    public boolean dfs(int source, int graph[][], boolean visited[], boolean dfsVisited[], boolean cycleP[]){
        visited[source] = true;
        dfsVisited[source] = true;
        
        for(int node: graph[source]){
            if(!visited[node]){
                if(dfs(node, graph, visited, dfsVisited, cycleP)){cycleP[source] = true; return true;}
            }
            else if(visited[node] && dfsVisited[node]){
                cycleP[source] = true;
                return true;
            }
        }
        
        dfsVisited[source] = false;
        return false;
    }
}