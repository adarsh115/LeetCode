class Solution {
    public int solve(int nums[], int start, int end){
        int first = 0;
        int second = 0;
        if(start == 0){
            for(int i=0; i<end-1; i++){
                int third = Math.max(first + nums[i], second);

                first = second;
                second = third;
            }
        }
        else if(start == 1){
            for(int i=1; i<end; i++){
                int third = Math.max(first + nums[i], second);

                first = second;
                second = third;
            }
        }

        

        return second;
    }
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        int n = nums.length;
        
        return Math.max(solve(nums, 0, n), solve(nums, 1, n));
    }
}