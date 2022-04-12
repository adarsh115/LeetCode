// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        Map<Character,Integer>  map=new HashMap<>();
        
        for(int k=0;k<pat.length();k++){
            map.put(pat.charAt(k),
            map.getOrDefault(pat.charAt(k),0)+1);
            
        }
        
        int i=0,j=0;
        int count=map.size(), n=txt.length();
        int k=pat.length();
        int occurences = 0;
        
        while(j<n){
            
            char temp = txt.charAt(j);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)-1);
                if(map.get(temp)==0){
                    count--;
                }
            }
            
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                if(count==0){
                    occurences++;
                }
                char x=txt.charAt(i);
                if(map.containsKey(x)){
                    if(map.get(x)==0) count++;
                    
                    map.put(x,map.get(x)+1);
                    i++;
                    j++;
                }else{
                    i++;
                    j++;
                }
                
            }
        }
        
        return occurences;
    }
}