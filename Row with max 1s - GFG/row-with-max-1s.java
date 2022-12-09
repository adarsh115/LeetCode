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
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int column = m;
        int maxzero = 0, row = 0;
        boolean noOne = true;
        for(int i=0; i<n; i++){
            
            int j = 0;
            int countzero = 0;
            
            while(j < m && arr[i][j] == 0){
                countzero++;
                j++;
            }
            
            countzero = column - countzero;
            if(countzero > 0)noOne = false;
            if(countzero > maxzero){
                maxzero = countzero;
                row = i;
            }
        }
        if(noOne)return -1;
        return row;
    }
}