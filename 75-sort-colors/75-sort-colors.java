class Solution {
    public void sortColors(int[] nums) {
        int z = 0;
        int t = nums.length-1;
        int i = 0;
        while(i<=t){
            if(nums[i] == 0){
                int temp = nums[z];
                nums[z] = nums[i];
                nums[i] = temp;
                z++;
                i++;
            }
            else if(nums[i] == 2){
                int temp = nums[t];
                nums[t] = nums[i];
                nums[i] = temp;
                t--;
            }
            else{
                i++;
            }
        }
        
        
    }
}