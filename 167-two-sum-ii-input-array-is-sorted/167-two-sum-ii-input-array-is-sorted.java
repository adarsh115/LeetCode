class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int s = 0;
        int e = numbers.length-1;
        int ans[] = new int[2];
        
        while(s < e){
            int sum = numbers[s] + numbers[e];
            
            if(sum > target)e--;
            else if(sum < target)s++;
            else if(sum == target){
                ans[0] = s+1;
                ans[1] = e+1;
                break;
            }
        }
        
        return ans;
    }
}