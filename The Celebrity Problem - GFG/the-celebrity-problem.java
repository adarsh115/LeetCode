// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> s = new Stack<>();
    	for(int i = 0; i<n; i++)s.push(i);
    	
    	while(s.size() != 1){
    	    int a = s.peek();
    	    s.pop();
    	    int b  = s.peek();
    	    s.pop();
    	    
    	    if(M[a][b] == 1)s.push(b);
    	    else s.push(a);
    	}
    	
    	int ans = s.peek();
    	
    	for(int i = 0; i<n; i++){
    	    if(i == ans)continue;
    	    if(M[ans][i] == 1) return -1;
    	    if(M[i][ans] == 0) return -1;
    	}
    	
    	return ans;
    }
}