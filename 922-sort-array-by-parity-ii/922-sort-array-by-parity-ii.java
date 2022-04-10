class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int e = 0;
        int o = 1;
        
        int i = 0;
        int out[] = new int[n];
        
        while(i < n){
           
            if(nums[i] % 2 == 0){
                out[e] = nums[i];
                e+=2;
            } 
            else{
                out[o] = nums[i];
                o+=2;
            }
            i++;
        }
        
        return out;
    }
}