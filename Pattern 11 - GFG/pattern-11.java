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
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                printNum(1, i);
            }
            else{
                printNum(0,i);
            }
            
            System.out.println();
        }
        
        
    }
    void printNum(int start, int count){
            if(count < 1)return;
            
            count = count-1;
            if(start == 1){
                System.out.print(start + " ");
                printNum(0, count);
            }
            else{
                System.out.print(start + " ");
                printNum(1, count);
            }
        }
}