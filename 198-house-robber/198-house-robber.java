class Solution {
    int dp[];
//     public int solve(int house, int nums[], int n){
//         if(house >= n)return 0;
        
//         if(dp[house] != -1)return dp[house];
//         int not_take = solve(house+1, nums, n);
//         int take = nums[house] + solve(house+2, nums, n);
        
//         return dp[house] = Math.max(take, not_take);
//     }
    public int rob(int[] nums) {
        // if(nums.length == 0)return 0;
        // if(nums.length == 1)return nums[0];
        // if(nums.length == 2)return Math.max(nums[0], nums[1]);
        int n = nums.length;
        this.dp = new int[n+1];
        // Arrays.fill(dp, -1);
        
        
//         dp[0] = nums[0];
//         dp[1] = nums[1];
        
        int first =0 ;
        int second = 0;
        
        
        for(int i=0; i<n; i++){
            int temp = Math.max(second, nums[i]+first);
            first = second;
            second = temp;
        }

        
        return second;
    }
}