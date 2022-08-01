class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length+2;
        
        int degree[] = new int[n];
        
        for(int nodes[] : edges){
            int start = nodes[0];
            int end = nodes[1];
            
            degree[start]++;
            degree[end]++;
        }
        
        int max = 0;
        
        for(int i=1; i<n; i++){
            if(degree[i] > max){
                max = i;
            }
        }
        
        return max;
    }
}