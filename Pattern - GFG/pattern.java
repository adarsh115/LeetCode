//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
        // Your code here
        printTop(n);
        printBottom(n);
    }
    
    void printTop(int n){
        for(int i=1; i<=n; i++){
            int stars = i;
            int spaces = (n-i);
            
            for(int j=1; j<=spaces; j++)System.out.print(" ");
            for(int j=1; j<= stars; j++)System.out.print("*" + " ");
            System.out.println();
        }
    }
    void printBottom(int n){
        for(int i=n; i>=1; i--){
            int stars = i;
            int spaces = (n-i);
            
            for(int j=1; j<=spaces; j++)System.out.print(" ");
            for(int j=1; j<= stars; j++)System.out.print("*" + " ");
            System.out.println();
        }
    }
}
