class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length;
        
        while(s < e){
            int mid = (s + e)/2;
            
            if(nums[mid] == target)return mid;
            else if(nums[mid] > target) e--;
            else s++;
        }
        
        return -1;
    }
}