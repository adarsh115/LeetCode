class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        for(int i=0; i<row; i++){
            if(board[i][0] == 'O')dfs(board, row, col, i, 0);
            if(board[i][col-1] == 'O')dfs(board, row, col, i, col-1);
        }
        for(int j=0; j<col; j++){
            if(board[0][j] == 'O')dfs(board, row, col, 0, j);
            if(board[row-1][j] == 'O')dfs(board, row, col, row-1, j);
        }


        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i][j] == 'O')board[i][j] = 'X';
                else if(board[i][j] == 'B')board[i][j] = 'O';
            }
        }
    }

    public void dfs(char board[][], int row, int col, int x, int y){
        if(x < row && x >= 0 && y < col && y >= 0 && board[x][y] == 'O'){
            board[x][y] = 'B';

            dfs(board, row, col, x, y+1);
            dfs(board, row, col, x, y-1);
            dfs(board, row, col, x+1, y);
            dfs(board, row, col, x-1, y);
        }
    }
}