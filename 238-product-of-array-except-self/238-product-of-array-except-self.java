class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product[] = new int[nums.length];
        
        int pre = 1;
        int prefix[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            pre = pre*nums[i];
            prefix[i] = pre;
            
        }
        
        int post = 1;
        int postfix[] = new int[nums.length];
        for(int i = nums.length-1; i>=0; i--){
            post = post*nums[i];
            postfix[i] = post;
            
        }
        
        System.out.print(Arrays.toString(prefix));
        System.out.print(Arrays.toString(postfix));
        
        // int prod = 1;
        
        for(int i =0 ; i<nums.length-1; i++){
            if(i == 0){product[i] = postfix[i+1];continue;}
            product[i] = prefix[i-1]*postfix[i+1];
        }
        product[nums.length-1] = prefix[nums.length-2];
        
        return product;
    }
}