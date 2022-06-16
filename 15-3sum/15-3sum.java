class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> allTriplets = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0; i<=n-3; i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            
            int target = -nums[i];
            int j = i+1;
            int k = n-1;
            
            while(j < k){
                int sum = nums[j] + nums[k];
                
                if(sum > target)k--;
                else if(sum < target)j++;
                else{
                    
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]); triplets.add(nums[j]); triplets.add(nums[k]);
                    allTriplets.add(triplets);
                    
                    while(j<k && nums[j] == nums[j+1])j++;
                    while(j<k && nums[k] == nums[k-1])k--;
                    
                    j++;
                    k--;
                }
            }
        }
        
        return allTriplets;
    }
}