class Solution {
    int first(int arr[], int target){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            
            if(arr[mid] == target){
                ans = mid;
                e = mid - 1;
            }
            else if(arr[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        
        return ans;
    }
    int last(int arr[], int target){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            
            if(arr[mid] == target){
                ans = mid;
                s = mid + 1;
            }
            else if(arr[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[]{-1, -1};
        if(nums.length == 0)return ans;
        
        ans[0] = first(nums, target);
        ans[1] = last(nums, target);
        
        return ans;
    }
}