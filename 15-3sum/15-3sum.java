class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList();
        
        if(nums.length < 3)return ls;
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0; i< n-2; i++){
            
            if(i == 0 || nums[i] != nums[i-1]){
                int start = i+1;
                int end = n-1;
                while(start < end){
                    int sum = nums[start] + nums[end];
                    if(sum == -(nums[i])){
                        List <Integer> list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        // System.out.print(list);
                        ls.add(list);
                        
                        while(start < end && nums[start] == nums[start+1])start++;
                        while(start < end && nums[end] == nums[end-1])end--;
                        
                        end--;
                        start++;
                    }
                    else if(sum > -(nums[i])){
                        end--;
                    }
                    else start++;
                }
            }

        }
        
        return ls;
    }
}