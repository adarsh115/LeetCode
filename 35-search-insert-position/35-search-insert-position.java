class Solution {
    public int searchInsert(int[] nums, int target) {
        int n  = nums.length;
        if(target < nums[0]) return 0;
        if(target > nums[n-1])return n;
        
        int s = 0;
        int e = n-1;
        int ans =  -1;
        
        while(s < e){
            int mid = s + (e-s)/2;
            
            if(nums[mid] == target)return mid;
            else if(nums[mid] < target) {
                ans = mid;
                s = s+1;
            }
            else e = e - 1;
        }
        
        return ans+1;
    }
}