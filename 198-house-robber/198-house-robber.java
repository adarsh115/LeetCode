class Solution {
    int dp[];
    public int solve(int nums[], int n, int i){
        if(i >= n)return 0;
        
        if(dp[i] != -1)return dp[i];
        int not_take = solve(nums,n, i+1);
        
        int take = nums[i] + solve(nums,n,i+2);
        
        return dp[i] = Math.max(take, not_take);
    }
    public int rob(int[] nums) {
        this.dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        
        return solve(nums, nums.length, 0);
    }
}