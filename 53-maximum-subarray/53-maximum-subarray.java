class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int current_max = 0;
        
        for(int x : nums){
            current_max = Math.max(x, current_max + x);
            max_so_far = Math.max(max_so_far, current_max);
        }
        
        return max_so_far;
        
    }
}