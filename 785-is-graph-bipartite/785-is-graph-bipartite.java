class Solution {
//     public boolean bfsCheck(int graph[][], int node, int color[]){
//         Queue<Integer> q = new LinkedList<>();
//         color[node] = 1;
        
//         q.add(node);
        
//         while(!q.isEmpty()){
//             int parent = q.remove();
            
//             for(int child : graph[parent]){
//                 if(child == -1){
//                     color[child] = 1-color[parent];
//                     q.add(child);
//                 }
//                 else if(color[child] == color[parent])return false;
//             }
//         }
        
//         return true;
       
//     }
    
//     public boolean isBipartite(int[][] graph) {
//        int n = graph.length;
        
//         int color[] = new int[n];
        
//         Arrays.fill(color, -1);
        
//         for(int i=0; i<n; i++){
//             if(color[i] == -1){
//                 boolean ans = bfsCheck(graph, i, color);
                
//                 if(ans == false)return false;
//             }
//         }
        
//         return true;
        
//     }
        public boolean bfsCheck(int graph[][], int node, int color[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        
        color[node] = 1;
        
        while(!q.isEmpty()){
            int temp = q.remove();
            for(int it: graph[temp]){
                if(color[it] == -1){
                    color[it] = 1-color[temp];
                    q.add(it);
                }
                else if(color[it] == color[temp])return false;
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
                boolean ans = bfsCheck(graph, i, color);
                // System.out.print(ans);
                if(ans == false)return false;
            }
        }
        return true;
        
    }
}