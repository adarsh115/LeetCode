class Solution {
    public int coinChange(int[] coins, int sum) {
        int n = coins.length;
        
        int dp[][] = new int[n+1][sum+1];
        
        for(int i=0;i<=n;i++) dp[i][0]=0;
        for(int i=0;i<=sum;i++) dp[0][i]=Integer.MAX_VALUE-1;
            
        for(int i=1;i<=sum;i++)
            {
                if(i%coins[0]==0)
                {
                   dp[1][i]=i/coins[0];
                }else{
                    dp[1][i]=Integer.MAX_VALUE-1;
                }
            }
        
        for(int i=2;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(coins[i-1]<=j){
                    dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum]==Integer.MAX_VALUE-1?-1:dp[n][sum];
    }
}