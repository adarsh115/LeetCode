// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        // map to store characters and thier frequency
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : S.toCharArray()){
            if(map.containsKey(c)){
                
                int current_count = map.get(c);
                
                map.put(c, current_count + 1);
            }
            else
                map.put(c ,1);
        }
        
        
        for(char c : S.toCharArray()){
            if(map.get(c) == 1)return c;
        }
        
        return '$';
    }
}

