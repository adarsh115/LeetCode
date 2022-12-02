//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean visited[][];
    HashSet<ArrayList<String>> set = new HashSet<>();
    int movex[] = {1,-1,0,0};
    int movey[] = {0,0,1,-1};
    
    void dfs(int grid[][], int x, int y, int initialX, int initialY, ArrayList<String> list){
        visited[x][y] = true;
        
        list.add(Integer.toString(x-initialX) + Integer.toString(y-initialY));
        
        for(int i=0; i<4; i++){
            int X = x + movex[i];
            int Y = y + movey[i];
            
            if(X >=0 && X < grid.length && Y >= 0 && Y < grid[0].length && !visited[X][Y] && grid[X][Y] == 1){
                dfs(grid, X, Y, initialX, initialY, list);
            }
        }
    }
    int countDistinctIslands(int[][] grid) {
        // Your Code here
        
        
        int n = grid.length;
        int m = grid[0].length;
        this.visited = new boolean[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    int initialX = i;
                    int initialY = j;
                    
                    ArrayList<String> list = new ArrayList<>();
                    
                    dfs(grid, i, j, initialX, initialY, list);
                    
                    set.add(list);
                }
            }
        }
        
        return set.size();
    }
}
