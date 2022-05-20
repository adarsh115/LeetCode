class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        
        int s = 0;
        int e = n-1;
        
        int area = Integer.MIN_VALUE;
        while(s < e){
            int width = e - s;
            
            int min_height = Math.min(height[s], height[e]);
            
            area = Math.max(area, min_height*width);
            
            if(height[s] < height[e])s++;
            else e--;
        }
        
        return area;
        
    }
}