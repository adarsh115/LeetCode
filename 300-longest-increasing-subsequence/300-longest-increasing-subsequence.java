class Solution {
    
    int dp[][];
    public int solve(int nums[], int i, int n, int prev){
        if(i == n)return 0;
        
        if(dp[i][prev+1] != -1)return dp[i][prev+1];
        
        int not_take = solve(nums, i+1, n, prev);
        
        int take = 0;
        if(prev == -1 || nums[i] > nums[prev]){
            take = 1+solve(nums, i+1, n, i);
        }
        
        
        return dp[i][prev+1] = Math.max(take, not_take);
    }
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        this.dp = new int[n+1][n+2];
//         for(int arr[] : dp){
//             Arrays.fill(arr, -1);
//         }
        
        for(int i = n-1; i>=0; i--){
            for(int p = i-1; p>=-1; p--){
                int not_take = dp[i+1][p+1];

                int take = 0;
                if(p == -1 || nums[i] > nums[p]){
                    take = 1+dp[i+1][i+1];
                }
                
                dp[i][p+1] = Math.max(not_take, take);
            }
        }
        
        return dp[0][0];
        // return solve(nums, 0, n, -1);
    }
}