class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if(target > nums[n-1])return n;
        if(target <= nums[0])return 0;
        
        
        int s=0, e = nums.length-1;
        
        while(s <= e){
            int mid = (s+e)/2;
            
            if(nums[mid] == target)return mid;
            else if(nums[mid] < target)s = mid+1;
            else{
                e = mid-1;
            }
        }
        
        return s;
    }
}