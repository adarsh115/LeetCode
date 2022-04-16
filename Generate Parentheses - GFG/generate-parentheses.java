// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public void generateBalanceParathesis(String op, int o, int c, List<String> list){
        if(o == 0 && c == 0){
            list.add(op);
            return;
        }
        

// 		if (o == c) {
// 			generateBalanceParathesis(op + "(", o - 1, c, list);
// 		} else {
// 			if (o != 0) {
// 				generateBalanceParathesis(op + "(", o - 1, c, list);
// 			}
// 			if (c != 0) {
// 				generateBalanceParathesis(op + ")", o, c - 1, list);
// 			}
// 		}
        
        if(o != 0){
            generateBalanceParathesis(op + "(", o - 1, c, list);
        
        }
        if( c > o){

            generateBalanceParathesis(op + ")", o, c - 1, list);
        }
        return;
    }
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        int open = n;
        int close = n;
        List<String> list = new ArrayList<>();
        String op = "";
        generateBalanceParathesis(op, open, close, list);
        
        return list;
    }
}