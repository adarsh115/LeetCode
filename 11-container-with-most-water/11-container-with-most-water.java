class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int water_gaps = 0;
        
        int buildings = height.length;
        
        int first_building = 0;
        int last_building = buildings-1;
        
        while(first_building < last_building){
            water_gaps = last_building - first_building;
            
            int height_first = height[first_building];
            int height_last = height[last_building];
            
            max_area = Math.max(max_area, (water_gaps * Math.min(height_first, height_last)));
            
            
            if(height_first < height_last)first_building++;
            else if(height_first > height_last)last_building--;
            else {
                first_building++;
                last_building--;
            }
            
            
        }
        
        return max_area;
    }
}