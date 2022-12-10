class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        
        int s = 0, e = n-1;
        
        while(s < e){
            if(nums[s] == 0){
                shiftLeft(nums, s, e);
                
                nums[e] = 0;
                e--;
            }
            else if(nums[s] != 0)s++;
        }
    }
    
    public void shiftLeft(int arr[], int index, int end){
        int i = index;
        while(i < end){
            arr[i] = arr[i+1];
            i++;
        }
    }
    
    public void swap(int nums[], int s, int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}