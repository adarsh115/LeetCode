class cell{
    int row;
    int col;
    cell(int r, int c){
        this.row = r;
        this.col = c;
    }
}
class Solution {
    
    public int orangesRotting(int[][] grid) {
        Queue<cell> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        
        int oranges = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 2)q.add(new cell(i, j));
                else if(grid[i][j]== 1) oranges++;
            }
        }
        
        if(q.size() == 0 && oranges == 0)return 0;
        if(q.size() == 0 && oranges !=0)return -1;
        
        
        int time = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            while(size-- > 0){
                cell currentcell = q.remove();
                
                int row = currentcell.row;
                int col = currentcell.col;
                System.out.println(grid[row][col]);
                
                if(row > 0 && grid[row-1][col] == 1){
                    System.out.print("top");
                    grid[row-1][col] = 2;
                    q.add(new cell(row-1, col));
                }
                if(row < m-1 && grid[row+1][col] == 1){
                    System.out.print("down");
                    grid[row+1][col] = 2;
                    q.add(new cell(row+1, col));
                }
                if(col> 0 && grid[row][col-1] == 1){
                    System.out.print("left");
                    grid[row][col-1] = 2;
                    q.add(new cell(row, col-1));
                }
                if(col < n-1 && grid[row][col + 1] == 1){
                    System.out.print("right");
                    grid[row][col+1] = 2;
                    q.add(new cell(row, col+1));
                }
            }
            time++;
        }
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 1)return -1;
            }
        }
        
        return time-1;
    }
}