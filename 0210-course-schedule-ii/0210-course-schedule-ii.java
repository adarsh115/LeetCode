class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        
        int n = numCourses;
        int order[] = new int[n];
        
        // if(pre.length == 0)return order;
        
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(n);
       
        
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int i=0; i<pre.length; i++){
            int course = pre[i][1];
            int dependency = pre[i][0];
            
            adjList.get(course).add(dependency);
        }
        
        int indegree[] = new int[n];

        for(ArrayList<Integer> dependent : adjList){
            for(int course: dependent)indegree[course]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(indegree[i] == 0)q.add(i);
        }
        
        int i=0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            
            order[i++] = node;
            
            for(int next: adjList.get(node)){
                indegree[next]--;
                
                if(indegree[next] == 0)q.add(next);
            }
        }
        
        return (i == n)? order : new int[0];
    }
}