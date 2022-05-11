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
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    // } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    
	    // Your code goes here
	    int m = (int)(1e9 + 7);
	    int t[][] = new int[n+1][sum+1];
	    
	    
	    for(int i=0; i<n+1; i++){
	        for(int j=0; j<sum+1; j++){
	           // if(i==0 && j==0)t[i][j] = 1;
	            if(i == 0){
	                if(j==0)t[i][j] = 1;
	                else t[i][j] = 0;
	            }
	            
	            else if(arr[i-1] <= j){
	                t[i][j] = (t[i-1][j- arr[i-1]]%m + t[i-1][j]%m)%m;
	            }
	            
	            else{
	                t[i][j] = t[i-1][j]%m;
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
}