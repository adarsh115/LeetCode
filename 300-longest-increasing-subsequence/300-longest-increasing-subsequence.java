class Solution {
    int n;
    int dp[][];
    public int solve(int index, int prev_index, int nums[]){
        if(index == n)return 0;
        
        if(dp[index][prev_index+1] != -1)return dp[index][prev_index+1];
        int not_take = solve(index+1, prev_index, nums);
        
        int take = 0;
        if(prev_index == -1 || nums[index] > nums[prev_index]){
            take = 1 + solve(index+1, index, nums);
        }
        
        return dp[index][prev_index+1] = Math.max(not_take, take);
     
    }
    public int lengthOfLIS(int[] nums) {
        this.n = nums.length;
        this.dp = new int[n+1][n+1];
        
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        
        return solve(0, -1, nums);
    }
}