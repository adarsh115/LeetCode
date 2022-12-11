class Solution {
    public void sortColors(int[] nums) {
     
        int n = nums.length;
        
        int zero = 0, two = n-1, i=0;
        
        while(i <= two){
            int num = nums[i];
            
            if(num == 2){
                swap(nums, i, two);
                two--;
            }
            if(num == 0){
                swap(nums, i, zero);
                zero++;
                i++;
            }
            if(num == 1)i++;
        }
    }
    
    public void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}