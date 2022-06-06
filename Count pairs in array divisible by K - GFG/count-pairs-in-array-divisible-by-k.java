// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    int k = Integer.parseInt(br.readLine().trim());
		    
		    Solution ob= new Solution();
		    System.out.println(ob.countKdivPairs(arr, n, k));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    // HashMap<Integer, Integer> map = new HashMap<>();
    public static long countKdivPairs(int arr[], int n, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        //code here
        
        long count  = 0;
        
        for(int x : arr){
            
            int rem = x % k;
            int comp_rem = k - rem;
            
            if(rem != 0){
                if(map.containsKey(comp_rem))count += map.get(comp_rem);
            }
            else{
                if(map.containsKey(0))count += map.get(0);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        
        return count;
    }
}