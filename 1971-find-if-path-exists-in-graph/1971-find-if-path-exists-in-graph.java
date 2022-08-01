class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }
        System.out.print(adjList);
        for(int i=0; i<edges.length; i++){
            int start = edges[i][0];
            int end = edges[i][1];
            
            adjList.get(start).add(end);
            adjList.get(end).add(start);
        }
        
        boolean visited[] = new boolean[n];
        visited[source] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        
        
        while(!q.isEmpty()){
            int node = q.remove();
            
            if(node == destination)return true;
            
            for(int neighbour : adjList.get(node)){
                if(!visited[neighbour]){
                    q.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        
        return false;
        
    }
}