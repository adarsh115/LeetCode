class Solution {
    public int fib(int n) {
        if(n <= 1)return n;
        
        // int dp[] = new int[n+1];
        // Arrays.fill(dp, -1);
        
        int first = 0;
        int second = 1;
        
        
        // if(n == 0)return 0;
        // if(n == 1)return 1;
        for(int i = 2; i<n+1; i++){
            
            int third = second + first;
            
            first = second;
            second = third;
            // if(dp[i] != -1)return dp[i];
            // dp[i] = dp[i-1] + dp[i-2];
        }
        
        // if(dp[n] != -1)return dp[n];
        
        return second;
        
    }
}