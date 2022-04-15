// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<int[]> s = new Stack<int[]>();
        int nrg[] = new int[n];
        
        for(int i = 0; i<n ; i++){
            if(s.isEmpty())nrg[i] = i-(-1);
            else if(s.size() > 0 && s.peek()[0] <= price[i]){
                while(s.size() > 0 && s.peek()[0] <= price[i]){
                    s.pop();
                }
                
                if(s.isEmpty())nrg[i] = i-(-1);
                else nrg[i] = i - s.peek()[1];
            }
            else{
                nrg[i] = i - s.peek()[1];
            }
            
            int e[] = new int[]{price[i], i};
            s.push(e);
        }
        
        return nrg;
    }
    
}