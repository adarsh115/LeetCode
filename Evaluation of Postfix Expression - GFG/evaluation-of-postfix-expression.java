//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            
            if(0 <= ch-'0' && ch - '0' <= 9){
                st.push(ch-'0');
            }
            else{
                int b = st.pop();
                int a = st.pop();
                
                int result = -1;
                
                switch(ch){
                    case '*': result = a * b;
                        break;
                    case '/': result = a / b;
                        break;
                    case '+': result = a + b;
                        break;
                    case '-': result = a - b;
                        break;
                }
                
                st.push(result);
            }
        }
        
        return st.peek();
    }
}