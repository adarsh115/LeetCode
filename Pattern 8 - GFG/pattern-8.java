//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=n; i>=1; i--){
            int start = i*2-1;
            int space = (n*2 - start)/2;
            
            for(int j=1; j<=space; j++)System.out.print(" ");
            for(int j=1; j<=start; j++)System.out.print("*");
            System.out.println();
            
        }
    }
}