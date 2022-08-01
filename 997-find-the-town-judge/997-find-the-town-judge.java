class Solution {
    public int findJudge(int n, int[][] trust) {
        int indegree[] = new int[n+1];
        int outdegree[] = new int[n+1];
        
        for(int i=0; i<trust.length; i++){
            indegree[trust[i][1]]++;
            outdegree[trust[i][0]]++;
        }
        
        int ans = -1;
        for(int i = 1; i<=n; i++){
            if(indegree[i] == n-1){ans = i; break;}
        }
        
        
        if(ans != -1 && outdegree[ans] == 0)return ans;
//         for(int i=1; i<=n; i++){
//             if(i != ans && degree[i] != 0)return -1;
//         }
        
        return -1;
    }
}