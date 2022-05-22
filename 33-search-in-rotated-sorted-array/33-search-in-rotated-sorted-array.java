class Solution {
    public int min(int arr[], int n){
        if(arr[0] <= arr[n-1])return 0;
        int s = 0;
        int e = n-1;
        
        while(s <= e){
            int mid  = s + (e-s)/2;
            
            if( arr[mid] <= arr[(mid -1 +n)%n] && arr[mid] <= arr[(mid + 1)%n]){
                return mid;
            }
            else if( arr[mid] >= arr[0] )s = mid + 1;
            else if( arr[mid] <= arr[n-1] )e = mid - 1;
        }
        
        return -1;
    }
    public int binarySearch(int arr[], int s, int e, int target){
        
        while(s <= e){
            int mid = s+ (e-s)/2;
            
            if(arr[mid] == target)return mid;
            else if(arr[mid] < target)s = mid+1;
            else {
                e = mid-1;
            }
        }
        
        return -1;
    }
    public int search(int[] nums, int target) {
        int min = min(nums, nums.length);
        // System.out.print(min);
        int ans1 = binarySearch(nums, 0, min-1, target);
        int ans2 = binarySearch(nums, min, nums.length-1, target);
        
        return Math.max(ans1, ans2);
        // return -1;
    }
}