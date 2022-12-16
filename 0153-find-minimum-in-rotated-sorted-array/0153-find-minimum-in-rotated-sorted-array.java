class Solution {
    public int findMin(int[] arr) {
        int s=0, n=arr.length, e=arr.length-1;
        
        if(n==1)return arr[0];
        if(arr[0] < arr[n-1])return arr[0];
        
        while(s <= e){
            int mid = s + (e-s)/2;
            
            if(arr[mid] < arr[(mid+1)%n] && arr[mid] < arr[(mid-1+n)%n]){
                return arr[mid];
            }
            else if(arr[mid] <= arr[n-1]){
                e = mid-1;
            }
            else if(arr[mid] >= arr[0]){
                s = mid+1;
            }

        }
        
        return -1;
    }
}