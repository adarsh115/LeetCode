class Solution {
    public int maxProduct(int[] nums) {
        int current_max = 1;
        int current_min = 1;
        int MAX = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            int potential_max = current_max*nums[i];
            int potential_min = current_min*nums[i];
            
            current_max = Math.max(nums[i], Math.max(potential_max, potential_min));
            current_min = Math.min(nums[i], Math.min(potential_max, potential_min));
            
            MAX = Math.max(current_max, MAX);
        }
        
        return MAX;
    }
    
}