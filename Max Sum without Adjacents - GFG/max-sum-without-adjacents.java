//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int dp[];
    int solve(int arr[], int n){
        if(n == 0 )return arr[0];
        if(n<0)return 0;
        
        if(dp[n]  != -1)return dp[n];
        
        int pick = arr[n] + solve(arr, n-2);
        
        int not_pick = solve(arr, n-1);
        
        return dp[n] =  Math.max(pick, not_pick);
        
    }
    int findMaxSum(int arr[], int n) {
        // code here
        this.dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(arr, n-1);
    }
}