class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
       
        List<List<Integer>> adjList = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            List<Integer> ls = new ArrayList<>();
            adjList.add(ls);
        }
        
        for(int i=0; i<prerequisites.length; i++){
            int course = prerequisites[i][0];
            int pre = prerequisites[i][1];
            
            adjList.get(course).add(pre);
        }
        
        boolean visited[] = new boolean[n];
        boolean dfsVisited[] = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                if(dfs(i, adjList, visited, dfsVisited))return false;
            }
        }
        
        return true;
    }
    
    public boolean dfs(int source, List<List<Integer>> adjList, boolean[] visited, boolean[] dfsVisited){
        visited[source] = true;
        dfsVisited[source] = true;
        
        for(int node: adjList.get(source)){
            if(!visited[node]){
                if(dfs(node, adjList, visited, dfsVisited))return true;
            }
            else if(visited[node] && dfsVisited[node])return true;
        }
        
        dfsVisited[source] = false;
        return false;
    }
}