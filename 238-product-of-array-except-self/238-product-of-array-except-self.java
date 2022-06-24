class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product[] = new int[nums.length];
        
        int pre = 1;
        for(int i=0; i<nums.length; i++){
            product[i] = pre;
            pre = pre*nums[i];
        }
        
        int post = 1;
        
        for(int i = nums.length-1; i>=0; i--){
            product[i] = product[i]*post;
            
            post = post*nums[i];
        }
        
        // System.out.print(Arrays.toString(product));
        
        return product;
    }
}