class Solution {
    List<List<String>> res = new ArrayList<>();
    Set<Integer> col = new HashSet<>();
    Set<Integer> negD = new HashSet<>();
    Set<Integer> posD = new HashSet<>();
    
    public void solve(int n, int r, String board[][]){
        if(r == n){
            List<String> list= new ArrayList<>();
            for(String row[] : board){
                String currentRow = String.join("", row);
                list.add(currentRow);
            }
            
            res.add(new ArrayList(list));
            return;
        }
        
        for(int c = 0; c < n; c++){
            if(col.contains(c) || negD.contains(r-c) || posD.contains(c+r))continue;
            
            col.add(c); negD.add(r-c); posD.add(r+c);
            board[r][c] = "Q";
            
            solve(n, r+1, board);
            
                           
            col.remove(c); negD.remove(r-c); posD.remove(r+c);
            board[r][c] = ".";
            
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        String board[][] = new String[n][n];
        for(String b[] : board){
            Arrays.fill(b, ".");
        }
        
        solve(n, 0, board);
        
        return res;
    }
}