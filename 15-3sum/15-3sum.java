class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //         Arrays.sort(nums);
        // List<List<Integer>> list = new ArrayList<>();
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         for(int k = j + 1; k < nums.length; k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 ArrayList<Integer> nums2 = new ArrayList<Integer>();
        //                 nums2.add(nums[i]);
        //                 nums2.add(nums[j]);
        //                 nums2.add(nums[k]);
        //                 if(!list.contains(nums2)) list.add(nums2);
        //             }
        //         }
        //     }
        // }
        // return list;
        
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