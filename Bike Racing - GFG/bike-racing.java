// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            long M = Long.parseLong(a[1]);
            long L = Long.parseLong(a[2]);
            long H[] = new long[N];
            long A[] = new long[N];
            for(int i = 0; i < N; i++){
                String a1[] = in.readLine().trim().split("\\s+");
                H[i] = Long.parseLong(a1[0]);
                A[i] = Long.parseLong(a1[1]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.buzzTime(N, M, L, H, A));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static long solve(int N, long limit, long inSpeed[], long acc[], long interval){
        long bikesSpeedAtInterval = 0;
        
        for(int i = 0; i< N; i++){
            long InitialSpeedOfCuurentBike = inSpeed[i];
            long intervalSpeedOfBike = InitialSpeedOfCuurentBike + acc[i]*interval;
            
            if(intervalSpeedOfBike >= limit){
                bikesSpeedAtInterval += intervalSpeedOfBike;
            }
            
        }
        
        return bikesSpeedAtInterval;
    }
    static long buzzTime(int N, long M, long L, long H[], long A[]){
        // code here
        
        long low = 0;
        long high = M;
        
        long ans = -1;
        
        while(low <= high){
            long mid = low +(high - low)/2;
            
            long speed = solve(N, L, H, A, mid);
            
            if(speed >= M){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return ans;
    }
}
