// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}
// } Driver Code Ends


class Solution {
    
    public String reverse(String s){
        //code here
        Stack stack = new Stack();
        for(int i = 0; i<s.length(); i++){
          stack.push(s.charAt(i));
        }

        StringBuilder reverse = new StringBuilder();
        while(!stack.isEmpty()){
          reverse.append(stack.pop());
        }
        
        return reverse.toString();
    }

}