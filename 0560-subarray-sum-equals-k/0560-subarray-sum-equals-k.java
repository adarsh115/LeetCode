class Solution {
    public int subarraySum(int[] arr, int k) {
        // Arrays.sort(arr);
        int n = arr.length;
        
//         int i=0, j=-1, sum = 0, maxLen = 0;
        
//         while(i<n){
            
//             while(j+1<n && (sum + nums[j+1] <= k)){
//                 j++;
                
//                 sum = sum + nums[j];
//             }
            
            
//             if(sum == k){
//                 maxLen = Math.max(maxLen, j-i+1);
//             }
            
//             sum = sum - nums[i];
//             i++;
//         }
        
//         return maxLen;
//           int start = 0, end = -1, sum = 0, maxLength = 0;
//   while (start < n) {
//     while ((end + 1 < n) && (sum + arr[end + 1] <= k))
//       sum += arr[++end];

//     if (sum == k)
//       maxLength = Math.max(maxLength, (end - start + 1));

//     sum -= arr[start];
//     start++;
//   }
//   return maxLength;
                Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        int count = 0;
        int sum = 0;
        
        for(int x : arr){
            sum += x;
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }
            
          map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}