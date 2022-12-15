class Solution {
    public int firstOccurence(int arr[], int target){
        int s=0, e = arr.length-1, ans = -1;
        
        while(s <= e){
            int mid = (s+e)/2;
            
            if(arr[mid] == target){
                ans = mid;
                e = mid-1;
            }
            else if(arr[mid] > target){
                e = mid-1;
            }
            else if(arr[mid] < target){
                s = mid+1;
            }
        }
        
        return ans;
    }
    public int lastOccurence(int arr[], int target){
        int s=0, e = arr.length-1, ans = -1;
        
        while(s <= e){
            int mid = (s+e)/2;
            
            if(arr[mid] == target){
                ans = mid;
                s = mid+1;
            }
            else if(arr[mid] > target){
                e = mid-1;
            }
            else if(arr[mid] < target){
                s = mid+1;
            }
        }
        
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccurence(nums, target), lastOccurence(nums, target)};
    }
}