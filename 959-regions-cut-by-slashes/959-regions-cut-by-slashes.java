class Solution {
    public void dfs(int i, int j,int[][] g){
        if(i<0 || i==g.length || j<0 || j==g.length || g[i][j] == 1) return;
        g[i][j] = 1;
        
        dfs(i-1,j,g);
        dfs(i+1,j,g);
        dfs(i,j-1,g);
        dfs(i,j+1,g);
    }  
    public int regionsBySlashes(String[] grid) {
        int n = grid.length, regions = 0;
        int[][] g = new int[n * 3][n * 3];
        
        
        for (int i = 0; i < n; ++i){
            char row[] = grid[i].toCharArray();
            for (int j = 0; j < n; ++j){
                
                if (row[j] == '/'){
                    g[i * 3 + 0][j * 3 + 2] = 1;
                    g[i * 3 + 1][j * 3 + 1] = 1;
                    g[i * 3 + 2][j * 3 + 0] = 1;
                } 
                else if (row[j] == '\\'){
                    g[i * 3 + 0][j * 3 + 0] = 1;
                    g[i * 3 + 1][j * 3 + 1] = 1;
                    g[i * 3 + 2][j * 3 + 2] = 1;
                } 
                   
                
            }
            
        }
        
        // for (int i = 0; i < 3 * n; ++i)
        //     System.out.println(Arrays.toString(g[i]));
        
        for (int i = 0; i < 3 * n; ++i)
            for (int j = 0; j < 3 * n; ++j) {
                if (g[i][j] == 1) continue;
                dfs( i, j, g);
                ++regions;
            }
        
        
        return regions;
    }
}