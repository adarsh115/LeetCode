class Solution {
    public int climbStairs(int n) {
        
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<n+1; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        // Arrays.fill(dp,-1);
        // return solve(n, dp);
        
        return dp[n];
    }
    
    public int solve(int n, int dp[]){
        if(n == 0 || n == 1)return 1;
        
        if(dp[n] != -1)return dp[n];
        
        return dp[n] = solve(n-1, dp) + solve(n-2, dp);
    }
}