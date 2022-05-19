class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(!set.containsKey(target - nums[i]))set.put(nums[i], i);
            else{
                int ione = set.get(target - nums[i]);
                return new int[]{ione, i};
            }
        }
        return new int[]{-1,-1};
    }
}