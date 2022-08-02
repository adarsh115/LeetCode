class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
                
        int row = matrix.length;
        int col = matrix[0].length;
        
        int i = 0;
        int j = col-1;
        
        System.out.print(matrix[i][j]);
        while(i < row && j >= 0){
            if(matrix[i][j] == target)return true;
            else if(matrix[i][j] > target)j--;
            else if(matrix[i][j] < target)i++;
        }
        
        return false;
    }
}