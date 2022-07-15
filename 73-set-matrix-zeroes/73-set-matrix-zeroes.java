class Pair{
    int x;
    int y;
    Pair(int _x, int _y){
        this.x = _x;
        this.y = _y;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Pair> list = new ArrayList<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[i][j] == 0)list.add(new Pair(i, j));
            }
        }

        for(Pair P : list){
            int row = P.x;
            int col = P.y;
            
            for(int j=0; j<m; j++){
                matrix[row][j] = 0;
            }
            for(int i=0; i<n; i++){
                matrix[i][col] = 0;
            }
        }
    }
}