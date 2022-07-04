class Solution {
    int dp[];
    public int solve(int nums[], int n){
        if(n == 0)return nums[0];
        if(n < 0)return 0;
        
        if(dp[n] != -1)return dp[n];
        
        int pick = nums[n] + solve(nums, n-2);
        int not_pick = solve(nums, n-1);
        
        return dp[n] = Math.max(pick, not_pick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        this.dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        return solve(nums, n-1);
    }
}