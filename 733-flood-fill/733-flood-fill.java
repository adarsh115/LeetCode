class Solution {
    public void solve(int image[][], int r, int c, int color, int fillcolor, int row, int col){
        if(r > row-1 || r < 0 || c > col-1 || c < 0)return;
        if(image[r][c] == fillcolor)return;
        if(image[r][c] != color)return;
        
        image[r][c] = fillcolor;
        
        solve(image, r+1, c, color, fillcolor, row, col);
        solve(image, r-1, c, color, fillcolor, row, col);
        solve(image, r, c+1, color, fillcolor, row, col);
        solve(image, r, c-1, color, fillcolor, row, col);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int fillcolor) {
        
        int row = image.length;
        int col = image[0].length;
        
        int color = image[sr][sc];
        if(color == fillcolor)return image;
        
        solve(image, sr, sc, color, fillcolor, row, col);
        
        return image;
        
    }
}