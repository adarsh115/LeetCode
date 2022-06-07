class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
//         int i = 0;
//         int j = 0;

//         while(i < m && j < n){
//             if(nums1[i] <= nums2[j]){
//                 i++;
//             }
//             else{
//                 int temp = nums1[i];
//                 nums1[i] = nums2[j];
//                 nums2[j] = temp;
//                 i++;
                
//                 Arrays.sort(nums2);
//             }
//         }

//         while(j < n){
//             nums1[i++] = nums2[j++];
//         }
        
        int i = m-1;
        int j = n-1;
        int k = m + n -1;
        
        while( j >= 0 ){
            if(i >= 0 && nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }

            
            k--;
        }

    }
}