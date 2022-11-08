//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        // code here
        
        int val = n;
        n = n*2-1;
        int front = 0;
        int back = n-1;
        
        int arr[][] = new int[n][n];
        
        while(val!=0){
            for(int i=front; i<=back; i++){
                for(int j=front; j<=back; j++){
                    if(i==front||j==front||i==back||j==back)arr[i][j] = val;
                }
            }
            
            front++;
            back--;
            val--;
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}