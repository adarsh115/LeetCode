class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> index = new ArrayList<>();
        
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    index.add(new int[]{i, j});
                }
            }
        }
        
        for(int i[]: index){
            int row = i[0], col = i[1];
            
            for(int k=0; k<matrix.length; k++){
                matrix[k][col] = 0;
            }
            for(int k = 0; k<matrix[0].length; k++){
                matrix[row][k] = 0;
            }
        }
    }
}