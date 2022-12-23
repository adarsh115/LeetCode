//{ Driver Code Starts
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
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack<Integer>();
    	
    	for(int i=0; i<n; i++){
    	    st.push(i);
    	}
    	
    	while(st.size() > 1){
    	    int first = st.peek();
    	    st.pop();
    	    
    	    int second = st.peek();
    	    st.pop();
    	    
    	    
    	    if(knows(first, second, M)){
    	        st.push(second);
    	    }
    	    else{
    	        st.push(first);
    	    }
    	}
    	
        //single element instact is potential celebrity;
        int element = st.peek();
        
        boolean rowCheck = true, colCheck = true;
        
        for(int i=0; i<n; i++){
            if(i == element)continue;
            
            if(M[element][i] == 1)rowCheck = false;
            
            if(M[i][element] == 0)colCheck = false;
        }
        
        return rowCheck && colCheck ? element : -1;
    }
    
    boolean knows(int a, int b, int Mat[][]){
        if(Mat[a][b] == 1)return true;
        return false;
    }
}