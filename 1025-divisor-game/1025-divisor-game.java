class Solution {
    int dp[];
    
    public int solve(int N){
        if(N == 1)return 0;
        if(dp[N] != -1)return dp[N];
        
        else{

            for(int i = 1; i*i <= N; i++){
                if(N % i == 0){
                    if(solve(N-i) == 0)return dp[N] = 1;
                    if(i != 1 && solve(N - (N/i)) == 0)return dp[N] = 1;
                }
            }
            
            return dp[N] = 0;
        }
    }
    public boolean divisorGame(int n) {
        this.dp = new int[1001];
        Arrays.fill(dp, -1);
        return solve(n) == 1;
    }
}