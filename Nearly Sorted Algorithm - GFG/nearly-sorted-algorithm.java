/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int t=0; t<test; t++){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int arr[] = new int[n];
		    
		  for(int j =0;j<n;j++)arr[j]=sc.nextInt();
		    
		    
		    
    		Queue<Integer> q = new PriorityQueue<>();
    		
    		for(int i=0; i<n; i++){
    			q.add(arr[i]);
    			if(q.size() > k){
    				System.out.print(q.peek()+" ");
    				q.remove();
    			}
    		}
    		
    		while(!q.isEmpty()){
    				System.out.print(q.peek()+" ");
    				q.remove();
    		}
    				System.out.println();
    		
    		
		}
	}
}