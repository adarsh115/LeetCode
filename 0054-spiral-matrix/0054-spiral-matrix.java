class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int left = 0, right = m, top = 0, bottom = n; 
        
        List<Integer> list = new ArrayList<>();
        
        while(left < right && top < bottom){
            
                for(int i=left; i<right; i++){
                    list.add(matrix[top][i]);
                }
                top++;
            
                for(int i=top; i<bottom; i++){
                    list.add(matrix[i][right-1]);
                }
                right--;
            
                if(!(left < right && top < bottom))break;
                
                for(int i=right-1; i>=left; i--){
                    list.add(matrix[bottom-1][i]);
                }
                bottom--;
                for(int i = bottom-1; i>= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
                
        }
        
        return list;
    }
}