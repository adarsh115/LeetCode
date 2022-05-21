class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//         int i = 0;
//         int j = matrix[i].length - 1;
        
//         while(i<matrix.length && j>=0){
//             if(matrix[i][j] == target)return true;
//             if(matrix[i][j] > target)j--;
//             else if(matrix[i][j] < target)i++;
//         }

        
//         return false;
        
        int m = matrix.length, n = matrix[0].length;
int lo = 0, hi = m - 1;
        
while (lo != hi) {
    int mid = lo + (hi - lo) / 2;
    if (matrix[mid][n - 1] < target) lo = mid + 1;
    else hi = mid;
}
if (matrix[lo][n - 1] < target) return false;
        
int i = lo;
lo = 0; hi = n - 1;
while (lo != hi) {
    int mid = lo + (hi - lo) / 2;
    if (matrix[i][mid] < target) lo = mid + 1;
    else hi = mid;
}
return matrix[i][lo] == target;
    }
}