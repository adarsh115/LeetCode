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
        
        int first = cost[0];
        int second = cost[1];
        
        if (n<=2) return Math.min(first, second);
        for(int i = 2; i<n; i++){
            int third = cost[i] + Math.min(first, second);
            first = second;
            second = third;
        }
        
        return Math.min(first, second);
    }

}