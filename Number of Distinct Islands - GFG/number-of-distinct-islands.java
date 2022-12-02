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
    int ax[] = {1,-1,0,0};
    int ay[] = {0,0,1,-1};
    
    void dfs(int grid[][], int x, int y, int n, int m, int X, int Y, ArrayList<String> island){
        visited[x][y] = true;
        island.add(Integer.toString(x-X)+" "+Integer.toString(y-Y));
        
        for(int i=0; i<4; i++){
            int row = x + ax[i];
            int col = y + ay[i];
            
            if(row >= 0 && row < n && col >=0 && col < m && grid[row][col] != 0 && visited[row][col] == false){
                dfs(grid, row, col, n, m, X, Y, island);
            }
        }
        
    }

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int n = grid.length;
        int m = grid[0].length;
        
        this.visited = new boolean[n][m];
        
        HashSet<ArrayList<String>> set = new HashSet<>();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(visited[i][j] == false && grid[i][j] == 1){
                    ArrayList<String> island = new ArrayList<>();
                    
                    dfs(grid, i, j, n, m, i, j, island);
                    
                    set.add(island);
                }
            }
        }
        
        return set.size();
    }
}
