class Solution {
    public void reverse(int [] nums, int s, int e){
        if(s == e)return;
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
// METHOD 1 : O(n) time complexity & O(n) space complexity
//         int ans[] = new int[nums.length];
        
//         for(int i = 0; i<nums.length; i++){
//             int pos = (i+k) % nums.length;
//             ans[pos] = nums[i];
//         }
        
//         for(int  i = 0; i<nums.length; i++ ){
//             nums[i] = ans[i];
//         }
// METHOD 2 : O(n) time complexity & O(1) space complexity
        
        if(k == 0 || nums.length == 1) return;
        
        k = k % nums.length;
        int split = nums.length-k;
        
        reverse(nums, 0, split-1);
        reverse(nums, split, nums.length-1);
        reverse(nums, 0, nums.length-1);
        
    }
}