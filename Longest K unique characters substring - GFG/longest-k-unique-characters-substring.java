// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        Map<Character, Integer> map = new HashMap();
        int i = 0;
        int j = 0;
        
        int longest = -1;
        
        while(j < s.length()){
            char x = s.charAt(j);
            
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
            // map.put(x, map.getOrDefault(map.get(x), 0) + 1);
            
            if(map.size() < k)j++;
            else if(map.size() == k){
                
                int currentLength = j-i+1;
                longest = Math.max(longest, currentLength);
                j++;
            }
            else if(map.size() > k){
                while(map.size() > k){
                    char y = s.charAt(i);
                    
                    map.put(y, map.get(y) - 1);
                    if(map.get(y) == 0)map.remove(y);
                    i++;
                } 
                j++;
            }
        }
        return longest;
    }
}