class Solution {
    Set<Integer> col  = new HashSet<Integer>();
    Set<Integer> nDia  = new HashSet<Integer>();
    Set<Integer> pDia  = new HashSet<Integer>();
    
    int count;
    
    public void solve(int board[][], int r, int n){
        if(r == n){
            count++;
            return;
        }
        
        for(int c=0; c<n; c++){
            if(col.contains(c) || nDia.contains(r-c) || pDia.contains(r+c))continue;
            
            col.add(c); nDia.add(r-c); pDia.add(r+c);
            
            board[r][c] = 1;
            
            solve(board, r+1, n);
            
            col.remove(c); nDia.remove(r-c); pDia.remove(r+c);
            
            board[r][c] = 0;
        }
        
    }
    
    public int totalNQueens(int n) {
        count = 0;
        int board[][] = new int[n][n];
        
        for(int b[] : board){
            Arrays.fill(b, 0);
        }
        
        solve(board, 0, n);
        
        return count;
    }
}