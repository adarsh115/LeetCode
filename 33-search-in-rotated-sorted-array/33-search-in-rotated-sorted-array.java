class Solution {
    int findMin(int nums[]){
        int s = 0;
        int e = nums.length-1;
        
//         0   1
//         3 , 1
        
        // if(nums[s] < nums[e])return s;
        int n = nums.length;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            int num = nums[mid];
            
            if(num <= nums[(mid + 1)%n] && num <= nums[(mid-1+n)%n]){
                return mid;
            }
            else if(num >= nums[0]){
                s = mid+1;
            }
            else if(num <= nums[n-1]){
                e = mid-1;
            }
            
        }
        
        return 0;
    }
    public int binarySearch(int nums[], int s, int e, int target){
        while(s <= e){
            int mid = s + (e-s)/2;
            
            if(nums[mid] == target)return mid;
            else if(nums[mid] > target)e = mid-1;
            else if(nums[mid] < target)s = mid+1;
            
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int minIndex = findMin(nums);
        
        System.out.print(minIndex);
        int firstPart = binarySearch(nums, 0, minIndex-1, target);
        int secondPart = binarySearch(nums, minIndex, nums.length-1, target);
        System.out.print(firstPart + " " + secondPart);
        
        return Math.max(firstPart,secondPart);
        
        // return -1;
    }
}