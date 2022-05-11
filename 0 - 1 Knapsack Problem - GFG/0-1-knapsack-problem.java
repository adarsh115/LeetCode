// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends


class Solution 
{ 
    static int t[][] = new int[1001][1001];
    // for(int row[] : t[][]){
    //     Arrays.fill(row, -1);
    // }
    public Solution(){
        // for (int[] row : t)
        //     Arrays.fill(row, -1);
        for(int i = 0 ; i < 1001; i++){
            for(int j = 0; j<1001; j++){
                if(i == 0 || j == 0)t[i][j] = 0;
            }
        }
    }

    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
         // your code here 
        //  if(n == 0 || w == 0)return 0;
        //  
        //  Now we will we will check if the item's weight is less than or greatert than the weight of
        // bag
        // 1 . Item's weightis less than bag's weight
        // if(t[n][w] != -1)return t[n][w];
        
        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<w+1; j++){
                if(wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        return t[n][w];
        
        
        // if(wt[n-1] <= w){
        //       t[n][w] =  Math.max(knapSack(w, wt, val, n-1) , (val[n-1] + knapSack(w - wt[n-1], wt, val, n-1)));
        //  }
        // //  2. Item's wieght is greater than bag's
        // else if(wt[n-1] > w){
        //      t[n][w] =  knapSack(w, wt, val, n-1);
        // }
        
        // return t[n][w];
    } 
}


