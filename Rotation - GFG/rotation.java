//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        
        if(n == 1)return 0;
        int s=0, e=n-1;
        if(arr[0] < arr[e])return 0;
        
        
        while(s <= e){
            int mid = s+(e-s)/2;
            
            if(arr[mid] < arr[(mid+1)%n] && arr[mid] < arr[(mid-1+n)%n])return mid;
            
            else if(arr[mid] >= arr[0]){
                s = mid+1;
            }
            else if(arr[mid] <= arr[e]){
                e = mid-1;
            }
        }
        
        return -1;
    }
}