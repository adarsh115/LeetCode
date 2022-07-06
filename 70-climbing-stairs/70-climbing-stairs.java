class Solution {
    int dp[];
    public int solve(int n){
        if(n <= 2)return n;
        
        if(dp[n] != -1)return dp[n];
        return dp[n] = solve(n-1) + solve(n-2);
    }
    public int climbStairs(int n) {
        this.dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        return solve(n);
    }
}