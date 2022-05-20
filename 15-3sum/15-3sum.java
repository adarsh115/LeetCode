class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3)return list;
        
        int a = 0;
		Arrays.sort(nums);
        
        while(a <= nums.length - 3){
//          if the number is at 0 or number is at not zero but also number is not equal to previous number
            if(a == 0 || (a > 0 && nums[a] !=nums[a-1])){
                int b = a+1;
                int c = nums.length-1;
                
                int target = 0-nums[a];
                while(b < c){
                    int sum = nums[b] + nums[c];
                    
                    if(sum == target){
                        
                        List<Integer> numbers = new ArrayList<>();
                        Collections.addAll(numbers, nums[a], nums[b], nums[c]);
                        list.add(numbers);
                        
                        while(b<c && nums[b] == nums[b+1])b++;
						while(b<c && nums[c] == nums[c-1])c--;
                        
                        b++;
                        c--;
                    }
                    else if(sum > target)c--;
                    else b++;
                }  
            }
            
            a++;
        }
        return list;
    }
}