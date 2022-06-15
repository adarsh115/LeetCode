class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //1. Brute force - In this approach we will be looping though array twice
        //                 as soon as we find the sum we will return the index of two numbers
        
        //2. HashSet - We will check for two numbers whose sum equals target
        
    
       Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            
            int current = nums[i];
            int diff = (-current + target);
            
            if(map.containsKey(diff)){
                return new int[]{i, map.get(diff)};
            }
            
            map.put(current, i);
        }
        
        return new int[]{-1,-1};
        
    }
}