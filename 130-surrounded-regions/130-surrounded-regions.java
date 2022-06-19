
class Solution {
    public void dfs(int r, int c, char board[][], int n, int m){
        if(r < 0 || c<0 || r == n || c == m || board[r][c] != ('O') )return;
        
        board[r][c] = 'S';
        dfs(r+1, c, board, n, m);
        dfs(r-1, c, board, n, m);
        dfs(r, c+1, board, n, m);
        dfs(r, c-1, board, n, m);
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        

        
        for(int j = 0; j<m; j++){
            if(board[0][j] == ('O')){
                // board[0][j] = 'S';
                dfs(0, j, board, n, m);
            }
            if(board[n-1][j] == ('O')){
                // board[n-1][j] = 'S';
                dfs(n-1, j, board, n, m);
            }
        }
        for(int i = 0; i<n; i++){
            if(board[i][0] == 'O'){
               // board[i][0] = 'S';
                dfs(i, 0, board, n, m);
            }
            if(board[i][m-1] == 'O'){
                // board[i][m-1] = 'S';
                dfs(i, m-1, board, n, m);
            }
        }

        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         System.out.print(board[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(board[i][j] == 'S')
                    board[i][j] = 'O';
            }
        }
        
    }
}