class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int arr[] = new int[m+n];
        
        int i = 0, j=0, k=0;
        
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }
        
        while(i < m){
            arr[k++] = nums1[i++];
        }
        while(j < n){
            arr[k++] = nums2[j++];
        }
        System.out.println(Arrays.toString(arr));
        
        if(m+n <= 1){
            return arr[arr.length/2] * 1.00000;
        }
        
        if((m+n)%2 == 0){
            return (arr[arr.length/2] + arr[(arr.length/2)-1])/2.00000;
        }
        // System.out.print();
        return arr[arr.length/2] * 1.00000;
    }
}