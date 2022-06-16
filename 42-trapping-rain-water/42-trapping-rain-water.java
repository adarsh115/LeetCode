class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        int maximumLeft[] = new int[n];
        int maximumRight[] = new int[n];
        
        int max = height[0];
        for(int i = 0; i<n; i++){
            maximumLeft[i] = Math.max(height[i], max);
            if(height[i] > max)max = height[i];
        }
        max = height[n-1];
        for(int i = n-1; i>=0; i--){
            maximumRight[i] = Math.max(height[i], max);
            if(height[i] > max)max = height[i];
        }
        
        int totalWater = 0;
        for(int i = 0; i<n; i++){
            int minHeight = Math.min(maximumLeft[i], maximumRight[i]);
            int waterLevel = minHeight - height[i];
            
            if(waterLevel > 0)totalWater += waterLevel;
        }
        
        return totalWater;
    }
}