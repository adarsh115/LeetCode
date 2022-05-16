class Solution {
    int countSubsetSum(int arr[], int sum){
        int n = arr.length;
	    int t[][] = new int[n+1][sum+1];
	    
	    
	    for(int i=0; i<n+1; i++){
	        for(int j=0; j<sum+1; j++){
	           // if(i==0 && j==0)t[i][j] = 1;
	            if(i == 0){
	                if(j==0)t[i][j] = 1;
	                else t[i][j] = 0;
	            }
	            
	            else if(arr[i-1] <= j){
	                t[i][j] = (t[i-1][j- arr[i-1]] + t[i-1][j]);
	            }
	            
	            else{
	                t[i][j] = t[i-1][j];
	            }
	        }
	    }
	   //for(int i = 0; i<n+1; i++){
    //         for(int j = 0; j<sum +1; j++){
    //             System.out.print(t[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
	    
	    return t[n][sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int totalsum = 0;
        for(int x: nums)totalsum += x;
        
        if(totalsum < Math.abs(target) || (target+totalsum) %2 != 0) return 0;
        
        int subsetsum = (target + totalsum)/2;
        
        return countSubsetSum(nums, subsetsum);
    }
}