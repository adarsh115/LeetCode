// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    void solve(String ip, String op, ArrayList<String> list){
        if(ip.length() == 0){
            list.add(op);
            return;
        }
        
        String op1 = op;
        String op2 = op;
        
        op1 = op1 + " " + ip.substring(0,1);
        op2 = op2 + ip.substring(0,1);
        
        ip = ip.substring(1);
        solve(ip, op1, list);
        solve(ip, op2, list);
        
        return;
    }
    
    ArrayList<String> permutation(String S){
        // Code Here
        ArrayList<String>list = new ArrayList<>();
        String op = "", ip = "";
        op = op+S.substring(0,1);
        ip= S.substring(1);
        
        solve(ip, op, list);
        return list;
    }
    
}