// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Searching
{
    public static void main (String[] args)throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
           String a[] = read.readLine().trim().split("\\s+");
           int n = Integer.parseInt(a[0]);
           long x = Long.parseLong(a[(int)1]);
           String st[] = read.readLine().trim().split("\\s+");
        
           long arr[] = new long[n];
           for(int i = 0; i < n; i++)
           {
               arr[i] = Long.parseLong(st[i]);
           }
           
           System.out.println(new Solution().findFloor(arr, n, x));
          
        }
    }
    
}// } Driver Code Ends


class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long nums[], int n, long target)
    {
       
        if(target < nums[0]) return -1;
        if(target >= nums[n-1])return n-1;
        
        int s = 0;
        int e = n-1;
        int ans =  -1;
        
        while(s < e){
            int mid = s + (e-s)/2;
            
            if(nums[mid] == target)return mid;
            else if(nums[mid] < target) {
                ans = mid;
                s = s+1;
            }
            else e = e - 1;
        }
        
        return ans;
        
    }
    
}
