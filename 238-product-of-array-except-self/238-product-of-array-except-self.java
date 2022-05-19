class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Method 1
//         int prefix[] = new int[n];
        
//         int pro = 1;
//         for(int i = 0; i<n; i++){
//             pro = pro*nums[i];
//             prefix[i] = pro;
//         }
        
//         pro = 1;
//         int postfix[] = new int[n];
//         for(int i = n-1; i>=0; i--){
//             pro = pro*nums[i];
//             postfix[i] = pro;
            
//         }
//         // System.out.println(Arrays.toString(postfix));
//         // System.out.println(Arrays.toString(prefix));
//         int product[] = new int[n];
        
//         for(int i = 0; i<n-1; i++){
//             if(i == 0) {product[i] = 1*postfix[i+1];continue;}
            

//             product[i] = prefix[i-1]*postfix[i+1];
//         }
//         product[n-1] = prefix[n-2]*1;
        
//         method 2
        
        int product[] = new int[n];
        
        int pre = 1;
        for(int i = 0; i<n; i++){
            product[i] = pre;
            pre = pre*nums[i];
        }
        int post = 1;
        for(int i = n-1; i>=0; i--){
            product[i] = product[i]*post;
            post = post*nums[i];
        }
        
        return product;
    }
}