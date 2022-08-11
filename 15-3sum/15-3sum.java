class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        // System.out.print(Arrays.toString(nums));
        int i=0;
        while(i <= n-3){
            if(i == 0 || nums[i] != nums[i-1]){
                
                int target = -nums[i];
                
                int s = i+1;
                int e = n-1;
                
                // System.out.print(target);
                while(s < e){
                    
                    int sum = nums[s] + nums[e];
                    if(sum == target){
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[s]);
                        triplet.add(nums[e]);

                        
                        list.add(new ArrayList<>(triplet));
                        
                        while(s < e && nums[s] == nums[s+1])s++;
                        while(s < e && nums[e] == nums[e-1])e--;
                        
                        s++;
                        e--;
                    }
                    else if(sum < target){
                        s++;
                    }
                    else{
                        e--;
                    } 
                }
                i++;
            }
            else{
                i++;
            }
        }
        return list;
    }
}