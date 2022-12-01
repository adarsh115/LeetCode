class Solution {
    public int numEnclaves(int[][] grid) {
        
        
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i=0; i<n; i++){
            if(grid[i][0] == 1){
                dfs(grid, n, m, i, 0);
            }
            
            if(grid[i][m-1] == 1){
                dfs(grid, n, m, i, m-1);
            }
        }
        
        
        for(int j=0; j<m; j++){
            if(grid[0][j] == 1){
                dfs(grid, n, m, 0, j);
            }
            
            if(grid[n-1][j] == 1){
                dfs(grid, n, m, n-1, j);
            }
        }
        
        for(int a[] : grid){
            System.out.print(Arrays.toString(a));
        }
        
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1)count++;
            }
        }
        
        return count;
    }
    
    public void dfs(int grid[][], int row, int col, int x, int y){
        if(x >= 0 && x<row && y >= 0 && y < col && grid[x][y] != 0){
            grid[x][y] = 0;
            
            dfs(grid, row, col, x+1, y);
            dfs(grid, row, col, x-1, y);
            dfs(grid, row, col, x, y-1);
            dfs(grid, row, col, x, y+1);
        }
    }
}