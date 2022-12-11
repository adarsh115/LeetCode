class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        
        for(int num: nums){
            currentSum = Math.max(num, currentSum+num);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
        

    }
}