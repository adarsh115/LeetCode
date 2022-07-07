class Solution {
    int dp[];
    
//     public int solve(int n){
//         if(n <= 2)return n;
        
//         if(dp[n] != -1)return dp[n];
        
//         return dp[n] = solve(n-1) + solve(n-2);
//     }
    public int climbStairs(int n) {
        this.dp = new int[n+1];
        
       
        if(n <= 2)return n;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i =3; i<n+1; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        
        
        return dp[n];
    }
}