class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        int res = nums.length-1;
        int result[] = new int[nums.length];
        while(res >= 0){
            if(Math.abs(nums[start]) > Math.abs(nums[end]) ){
                result[res] = nums[start]*nums[start];
                start++;
            }
            else{
                result[res] = nums[end]*nums[end];
                end--;
            }
            res--;
        }
        return result;
    }
}