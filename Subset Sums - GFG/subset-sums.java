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
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    
    
    void solve(ArrayList<Integer> arr, int n, ArrayList<Integer> subsetSum,int sum){
        if(n == 0){
            subsetSum.add(sum);
            return;
        }
        
        int last = arr.get(n-1);
        
        solve(arr, n-1,subsetSum, sum);
        solve(arr, n-1, subsetSum, sum + last);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> subsetSum = new ArrayList<>();
        
        int sum = 0;
        solve(arr, N, subsetSum, sum);
        
        return subsetSum;
    }
}