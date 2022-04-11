class Solution {
    public void reverse(int[] arr, int s, int e){
        if(s==e)return;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] arr, int k) {
        // if length of array is 1, then ratated array will be same as before after rotation
        if(arr.length <= 1)return;
        
        int n = arr.length;
        
        k = k % n;
        k = n-k;
        
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr,0 ,n-1);
        
        
    }
}