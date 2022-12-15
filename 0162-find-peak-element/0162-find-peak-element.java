class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if(n == 1)return 0;
        
        int s=0, e=n-1;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            
            if(mid == 0 || mid == n-1){
                if(mid == 0){
                    return arr[mid] > arr[mid+1] ? mid : mid+1;
                }
                
                if(mid == n-1){
                    return arr[mid] > arr[mid-1] ? mid : mid-1;
                }
            }
            else if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }
            else if(arr[mid] < arr[mid-1]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            
        }
        
        return -1;
    }
}