// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // public boolean detectCycle(ArrayList<ArrayList<Integer>> adj, 
    // HashMap<Integer, Boolean> map, int curr){
    //     if(map.get(curr) == true)return true;
        
    //     map.replace(curr, true);
    //     boolean flag = false;
        
    //     for(int i = 0; i<adj.get(curr).size(); i++){
            
    //         flag = detectCycle(adj, map, adj.get(curr).get(i));
    //         if(flag == true)return true;
    //     }
    //         map.replace(curr, false);
    //     return false;
    // }
    
    // // Function to detect cycle in a directed graph.
    // public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
        

    //     HashMap<Integer, Boolean> map = new HashMap<>();
    //     for(int i = 0; i<V; i++){
    //         map.put(i, false);
    //     }
        
    //     boolean flag = false;
    //     // System.out.print("gvhgg"+adj.get(1).size()+"bjj");
    //     for(int i = 0; i<V; i++){
    //         map.replace(i, true);
    //         for(int j = 0; j<adj.get(i).size(); j++){
                
    //             flag = detectCycle(adj, map, adj.get(i).get(j));
    //             if(flag == true)return true;
                
    //         }
            
    //         map.replace(i, false);
    //     }
    //     return false;
    // }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
public boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] visited, int i) {
    if(visited[i] == 1)return true;
    
    if(visited[i] == 2)return false;
    
    visited[i] = 1;
    
    for(int edge : adj.get(i)) {
        if( dfs(adj, visited, edge) )return true;
    }
    
    visited[i] = 2;
    return false;
}
    
    
    
public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj){
    int[] visited = new int[V];
    
    for(int i=0; i<V; i++) {
        if( visited[i] == 0) {
            if(dfs(adj, visited, i))return true;
        }
        
    }
    return false;
}
    
    
    
    
    
    
    
    
}