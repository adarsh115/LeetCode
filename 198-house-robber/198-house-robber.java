class Solution {
    int dp[];
    public int solve(int house, int nums[], int n){
        if(house >= n)return 0;
        
        if(dp[house] != -1)return dp[house];
        int not_take = solve(house+1, nums, n);
        int take = nums[house] + solve(house+2, nums, n);
        
        return dp[house] = Math.max(take, not_take);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        this.dp = new int[n+1];
        Arrays.fill(dp, -1);

        return solve(0, nums, n);
    }
}