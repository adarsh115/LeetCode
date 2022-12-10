class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        
        int top = 0, bottom = row-1;
        
        while(top <= bottom){
            int mid = (top+bottom)/2;
            
            if(matrix[mid][0] > target){
                bottom = mid-1;
            }
            else if(matrix[mid][col-1] < target){
                top = mid+1;
            }
            else break;
            
        }
        
        if(top > bottom)return false;
        else row = (top+bottom)/2;
        
        int low = 0,high=col-1;
        
        while(low <= high){
            int mid = (low+high)/2;
            
            if(matrix[row][mid] == target)return true;
            else if(matrix[row][mid] > target)high = mid-1;
            else if(matrix[row][mid] < target)low = mid+1;
        }
        
        return false;
    }
}