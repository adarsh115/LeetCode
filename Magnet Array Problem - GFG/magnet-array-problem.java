// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            double a[] = new double[(int)(n)];
            double getAnswer[] = new double[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Double.parseDouble(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.nullPoints(n, a, getAnswer); 
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n-1;i++)
                output.append(String.format("%.2f", getAnswer[i])+" ");
                
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void nullPoints(int n, double magnets[], double getAnswer[])
    {
        // Your code goes here 
                for(int i=0; i<n-1; i++){
            getAnswer[i] = mid_point(magnets[i], magnets[i+1], magnets, n);
        }
    }
    public double mid_point(double l, double h, double magnets[], int n){
        while(l<=h){
            double m=(h+l)/2;
            double t_force=0;
            for(int i=0; i<n; i++){
                t_force += 1/(m-magnets[i]);
            }
            if(Math.abs(t_force)<0.000001){
             return m;   
            }
            else if(t_force<0){
                h=m;
            }
            else{
                l=m;
            }
        }
        return l;
        }
}


