class Solution {
    int dp[];
//     public int solve(int nums[], int n){
//         if(n == 0)return nums[0];
//         if(n < 0)return 0;
        
//         if(dp[n] != -1)return dp[n];
        
//         int pick = nums[n] + solve(nums, n-2);
//         int not_pick = solve(nums, n-1);
        
//         return dp[n] = Math.max(pick, not_pick);
//     }
    public int rob(int[] nums) {
            if(nums.length==0) return 0;
    if(nums.length==1) return nums[0];
        int n = nums.length;
        
        this.dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++){
            int take = nums[i] + first;            
            int not_take = second;
            
            
            int current = Math.max(take, not_take);
            
            first = second;
            second = current;
        }
        
        return second;
    }
}