class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1)return nums[0] == target ? 0 : -1;
        int minIndex = findMin(nums);
        
        int first = binarySearch(nums, target, 0, minIndex-1);
        int second = binarySearch(nums, target, minIndex, nums.length-1);
        
        System.out.println(first + " " + second);
        // return nums[minIndex];
        
        if(first == -1 && second == -1)return -1;
        
        if(first == -1)return second;
        return first;
    }
    
    public int binarySearch(int arr[], int target, int a, int b){
        int s=a, e=b;
        
        while(s<=e){
            int mid  = s+(e-s)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                s =  mid+1;
            }
            else if(arr[mid] > target){
                e =  mid-1;
            }
        }
        
        return -1;
    }
    
    public int findMin(int arr[]){
        int s=0,e=arr.length-1,n=arr.length;
        
        if(arr[0] < arr[e]){
            return 0;
        }
        
        while(s <= e){
            int mid = s+(e-s)/2;
            
            if(arr[mid] < arr[(mid+1)%n] && arr[mid] < arr[(mid-1+n)%n]){
                return mid;
            }
            else if(arr[mid] >= arr[0]){
                s = mid+1;
            }
            else if(arr[mid] <= arr[e]){
                e = mid-1;
            }
        }
        
        return -1;
    }
}