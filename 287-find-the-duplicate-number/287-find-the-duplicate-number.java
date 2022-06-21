class Solution {
    public int findDuplicate(int[] nums) {
// 	    int slow = 0;
//         int fast = 0;
        
//         while(true){
//             slow = nums[slow];
//             fast = nums[nums[fast]];
            
//             if(slow == fast)break;
            
//         }
//         fast = 0;
        
//         while(true){
//             slow = nums[slow];
//             fast = nums[fast];
//             if(slow == fast)return slow;
//         }
        
        int first = 1;
        int last = nums.length-1;

        while(first < last){
            int mid = first + (last-first)/2;
            
            int count = 0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i] <= mid)count++;
            }
            
            if(count <= mid)first = mid+1;
            else last = mid;
        }
        return first;
    }
}