class Solution {
    public int singleNonDuplicate(int[] nums) {
//             int missing_Element = 0;
//     for(int val : nums)
//         missing_Element ^= val;
        
//     return missing_Element;
        
        int s = 0;
        int e = nums.length-1;
        
        if(s == e)return nums[0];
        else if( nums[s] != nums[s + 1])return nums[0];
        else if(nums[e] != nums[e - 1])return nums[e];
        
        while(s <= e){
            int mid = s + (e - s)/2;
            
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])return nums[mid];
            else if(mid % 2 == 0 && nums[mid] == nums[mid +1] || mid % 2 == 1 && nums[mid] == nums[mid-1])s = mid + 1;
            else e = mid-1;
        }
        
        return -1;
    }
}