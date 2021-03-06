class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        int count = 0;
        int sum = 0;
        
        for(int x : nums){
            sum += x;
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }
            
            if(map.containsKey(sum)){
                map.put(sum, (map.get(sum)+1));
            }
            else{
                map.put(sum, 1);
            }
          // map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
        
//                 int sum = 0, result = 0;
//         Map<Integer, Integer> preSum = new HashMap<>();
//         preSum.put(0, 1);
        
//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i];
//             if (preSum.containsKey(sum - k)) {
//                 result += preSum.get(sum - k);
//             }
//             preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
//         }
        
//         return result;
    }
}