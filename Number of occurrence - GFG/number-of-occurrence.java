// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int first(int arr[], int t){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        
        while(s <= e){
            int mid = s + ( e - s)/2;
            
            if(arr[mid] == t){
                ans = mid;
                e = e - 1;
            }
            else if(arr[mid] > t){
                e = e -1;
            }
            else{
                s = s + 1;
            }
            
        }
        
        return ans;
    }
    int second(int arr[], int t){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        
        while(s <= e){
            int mid = s + ( e - s)/2;
            
            if(arr[mid] == t){
                ans = mid;
                s = s + 1;
            }
            else if(arr[mid] > t){
                e = e -1;
            }
            else{
                s = s + 1;
            }
            
        }
        
        return ans;
    }
    int count(int[] arr, int n, int x) {
        // code here
        if(n == 0)return 0;
        
        int first = first(arr, x);
        int second = second(arr, x);
        if(first == -1 && second == -1)return 0;
        return second - first + 1;
    }
}