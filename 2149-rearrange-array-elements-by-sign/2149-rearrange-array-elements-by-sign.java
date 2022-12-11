class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int nn = ;
        int arr[] = new int[nums.length];
        
        int p = 0, n = 1;
        
        for(int num: nums){
            if(num > 0){
                arr[p] = num;
                p+=2;
            }
            else if(num < 0){
                arr[n]= num;
                n+=2;
            }
        }
        
        return arr;
    }
    

}