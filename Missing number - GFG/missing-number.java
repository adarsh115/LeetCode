//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n-1; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.missingNumber(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         // Your code goes here
        //  int arr[] = new int[N+1];
         
        //  for(int num: A){
        //      arr[num] = num;
        //  }
         
        //  for(int i=1; i<arr.length; i++){
        //      if(arr[i] == 0)return i;
        //  }
         
        //  return 0;
        
        int sum = N*(N+1)/2;
        int arrSum = 0;
        
        for(int num: A){
            arrSum += num;
        }
        
        return sum - arrSum;
    }
}