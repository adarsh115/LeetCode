class Solution {
    public void rotate(int[][] matrix) {
        
        //Transopse
        
        Transpose(matrix);
        
        //reverse rows
        for(int row[] : matrix){
            reverse(row);
        }
    }
    public void Transpose(int arr[][]){
        int n = arr.length, m = arr[0].length;
        
        for(int i=0; i<n; i++){
            for(int j = i+1; j<m; j++){
                // if(i == j)continue;
                
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public void reverse(int row[]){
        int s = 0, e = row.length-1;
        
        while(s<e){
            int temp = row[s];
            row[s] = row[e];
            row[e] = temp;
            s++; e--;
        }
    }
}