class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, f, s;
        
        for(f = n-2; f>=0; f--){
            if(nums[f] < nums[f+1])break;
        }
        
        if(f < 0){
            reverse(nums, 0, n-1);
        }
        else{
            for(s = n-1; s>f; s--){
                if(nums[s] > nums[f])break;
            }
            
            swap(nums, f, s);
            reverse(nums, f+1, n-1);
        }

    }
    public void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void reverse(int nums[], int a, int b){
        while(a < b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++; b--;
        }
    }
}