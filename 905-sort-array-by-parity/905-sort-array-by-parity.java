class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length <= 1)return nums;
        
        int even  = 0;
        int odd = nums.length-1;
        
        int i = 0;
        while(i<=odd){
            if(nums[i] % 2 == 0){
                i++;
                even++;
            }
            else{ 
                int temp = nums[i];
                nums[i] = nums[odd];
                nums[odd] = temp;
                odd--;
            }
        }
        
        return nums;
    }
}