class Solution {
    List<List<Integer>> allPath;
    
    public void solve(int graph[][], int n, List<Integer> path, int node){
        path.add(node);
        
        if(node == n-1){
            allPath.add(new ArrayList(path));
        }
        else{
            for(int neighbour : graph[node]){
                solve(graph, n, path, neighbour);
            }
        }
        
        path.remove(path.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.allPath = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        solve(graph, graph.length, path, 0);
            
        return allPath;
    }
}