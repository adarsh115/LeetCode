// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            String S = read.readLine();
            

            Solution ob = new Solution();
            

            
            System.out.println(ob.Count(S));
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int Count(String S)
    {
        // if String is empty then count of characters will be 0
        if(S.length() == 0)return 0;

        int count = 0; //count variable to hold count of alphabets
        
        // Using for earch loop on array of character
        for(char c : S.toLowerCase().toCharArray()){
            if(c - 'a' >= 0 && c - 'a' <= 26)count++;
        }
        
        return count;
    }
}