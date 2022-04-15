class Solution {
    public int[] nearest_smallest_right(int arr[], int n){
        Stack<int[]> s = new Stack<>();
        
        int nsr[] = new int[n];
        
        for(int i = n-1; i>=0; i--){
            while(s.size() > 0 && s.peek()[0] >= arr[i])s.pop();
            
            if(s.isEmpty())nsr[i] = n;
            else nsr[i] = s.peek()[1];
            
            int pair[] = new int[]{arr[i], i};
            s.push(pair);
        }
        
        return nsr;
    }
    public int[] nearest_smallest_left(int arr[], int n){
        Stack<int[]> s = new Stack<>();
        
        int nsl[] = new int[n];
        
        for(int i = 0; i<n; i++){
            while(s.size() > 0 && s.peek()[0] >= arr[i])s.pop();
            
            if(s.isEmpty())nsl[i] = -1;
            else nsl[i] = s.peek()[1];
            
            int pair[] = new int[]{arr[i], i};
            s.push(pair);
        }
        
        return nsl;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int nearest_smallest_right[] = new int[n];
        int nearest_smallest_left[] = new int[n];
        int width[] = new int[n];
        
        
        nearest_smallest_right = nearest_smallest_right(heights, n);
        nearest_smallest_left = nearest_smallest_left(heights, n);
        
        System.out.println(Arrays.toString(nearest_smallest_right));
        System.out.println(Arrays.toString(nearest_smallest_left));
        
        for(int i = 0; i<n; i++){
            width[i] = nearest_smallest_right[i] - nearest_smallest_left[i] - 1;

        }
        
        int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			int area = heights[i]*width[i];
			if(area > max)max = area;
		}
        
        return max;
    }
}