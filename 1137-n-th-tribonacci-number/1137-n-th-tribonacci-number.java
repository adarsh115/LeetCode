class Solution {
    int dp[];
    public int solve(int n){
        if(n == 0)return 0;
        if(n == 1 || n == 2)return 1;
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        
        for(int i = 3; i<n+1; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        
        return dp[n];
    }
    public int tribonacci(int n) {
        this.dp = new int[38];
        Arrays.fill(dp, -1);
        return solve(n);
    }
}