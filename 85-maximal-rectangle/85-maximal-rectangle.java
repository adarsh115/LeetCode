class Solution {
    public int[] nearest_smallest_right(int arr[], int n){
        
        Stack<int[]> s = new Stack<>();
        int ans[] = new int[n];
        
        for(int i = n-1; i>=0; i--){
            while(s.size() > 0 && s.peek()[0] >= arr[i])s.pop();
            
            if(s.isEmpty())ans[i] = n;
            else ans[i] = s.peek()[1];
            
            int pair[] = new int[]{arr[i], i};
            s.push(pair);
        }
        
        return ans;
    }
    public int[] nearest_smallest_left(int arr[], int n){
        
        Stack<int[]> s = new Stack<>();
        int ans[] = new int[n];
        
        for(int i = 0; i<n; i++){
            while(s.size() > 0 && s.peek()[0] >= arr[i])s.pop();
            
            if(s.isEmpty())ans[i] = -1;
            else ans[i] = s.peek()[1];
            
            int pair[] = new int[]{arr[i], i};
            s.push(pair);
        }
        
        return ans;
    }
    public int maximumAreaHistogram(int heights[]){
        int n = heights.length;
        int nearest_smallest_right[] = new int[n];
        int nearest_smallest_left[] = new int[n];
        int width[] = new int[n];
        int max = Integer.MIN_VALUE;
        
        nearest_smallest_right = nearest_smallest_right(heights, n);
        nearest_smallest_left = nearest_smallest_left(heights, n);
        
        for(int i = 0; i < n; i++){
            width[i] = nearest_smallest_right[i]-nearest_smallest_left[i]-1;
            max = Math.max(max, heights[i]*width[i]);
        }
        
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int row[] = new int[cols];
        
        for(int i = 0; i<cols; i++){
            row[i] = (matrix[0][i] - '0');
        }
        
        int maxArea = maximumAreaHistogram(row);
        
        for(int i = 1; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if((matrix[i][j] - '0') == 0)row[j] = 0;
                else row[j] = row[j] + (matrix[i][j] - '0');
            }
            maxArea = Math.max(maxArea, maximumAreaHistogram(row));
        }
        
        return maxArea;
    }
}