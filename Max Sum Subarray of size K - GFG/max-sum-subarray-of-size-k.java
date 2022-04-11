// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int maximumSumSubarray(int K, ArrayList<Integer> arr,int N){
        // code here
        int max = 0;
        int j = 0;
        int windowSum = 0;
        while(j < K){
            windowSum += arr.get(j);
            j++;
        }
        max = Math.max(max, windowSum);
        int i = 0;
        while(j<N){
            int currentSum = windowSum + arr.get(j)-arr.get(i);
            max = Math.max(max, currentSum);
            windowSum = currentSum;
            j++;
            i++;
        }
        
        return max;
    }
}