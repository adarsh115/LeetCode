class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length <= 1)return nums;
        
        int pointer = 0;
        int even = 0;;
        
        while(pointer < nums.length && even < nums.length){
            if(nums[pointer] % 2 == 0){
                int temp = nums[pointer];
                nums[pointer] = nums[even];
                nums[even] = temp;
                even++;
            }
            pointer++;
        }
        
       return nums; 
    }
}