class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i<grid[0].length; i++){
            if(grid[0][i] == 1)dfs(grid, 0, i);
        }
        

             
        
        
        for(int i = 0 ; i<m ; i++){
            if(grid[i][0] == 1){
                dfs(grid, i, 0);
            }
        }
        
        //right border
        for(int i = 0 ; i<m ; i++){
            if(grid[i][n-1] == 1){
                dfs(grid, i, n-1);
            }
        }
        
        //bottom border
        for(int j = 0 ; j<n ; j++){
            if(grid[m-1][j] == 1){
                dfs(grid, m-1, j);
            }
        }
        
        
        
        
        int count = 0;
        
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void dfs(int arr[][], int i, int j){
        if(i < 0 || j< 0 || i>=arr.length || j>=arr[0].length || arr[i][j] == 0)return;
        
        arr[i][j] = 0;
        
        dfs(arr, i, j+1);
        dfs(arr, i, j-1);
        dfs(arr, i+1, j);
        dfs(arr, i-1, j);
    }
}