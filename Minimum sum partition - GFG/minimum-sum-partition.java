// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> subsetSum(int arr[], int n, int range)
	{
	    boolean dp[][] = new boolean[n+1][range+1];
	    
	    for(int i = 0; i < range+1; i++)
	        dp[0][i] = false;
	    for(int i = 0; i < n+1; i++)
	        dp[i][0] = true;
	        
	    for(int i = 1; i < n+1; i++)
	        for(int j = 1; j < range+1; j++)
	        {
	            if(arr[i-1] <= j)
	                dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
	            else
	                dp[i][j] = dp[i-1][j];
	        }
	    
	    ArrayList<Integer> v = new ArrayList<>();
	    for(int i = n; i < n+1; i++)
	        for(int j = 0; j <= range/2; j++)
	        {
	            if(dp[i][j] == true)
	                v.add(j);
	        }
	    
	    return v;
	}

	public int minDifference(int nums[], int n) 
	{ 
	    // Your code goes here
	            int range = 0;
	   
        
        for(int i = 0; i < n; i++)
	        range = range + nums[i];
	    
        ArrayList<Integer> v = new ArrayList<>();
	    v = subsetSum(nums, n, range);
        
        // System.out.print(v);
	    
        int mn = Integer.MAX_VALUE;
	    for(int i = 0; i < v.size(); i++)
	        mn = Math.min(mn, Math.abs(-range+(2*v.get(i))));
	    return mn;
	} 
}
