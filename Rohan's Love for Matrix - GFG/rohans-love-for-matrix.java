// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.firstElement(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution {
    static int firstElement(int n) {
        // code here
        
        int first = 0;
        int second = 1;
        
        for(int i = 2; i<n+1; i++){
            int third = (first + second)% 1000000007;
            
            first = second;
            second = third;
        }
        
        return second;
    }
}