class Solution {
    int dp[];
//     private int minCost(int[] cost, int n) {
//         if (n < 0) return 0;
//         if (n==0 || n==1) return cost[n];
        
//         if(dp[n] != -1)return dp[n];
//         return dp[n] = cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
//     }
    
    public int minCostClimbingStairs(int[] cost) {
    
        
        this.dp = new int[1001];
        Arrays.fill(dp, -1);

            int n = cost.length;
        for(int i = 0; i<n; i++){
            if(i <= 1){
                dp[i] = cost[i];
            }
            else{
                dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
            }
        }
        
        return Math.min(dp[n-2], dp[n-1]);
    }

}