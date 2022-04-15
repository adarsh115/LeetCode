class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int maxtoLeft[] = new int[n];
        int maxtoRight[] = new int[n];
        
        maxtoLeft[0] = height[0];
        for(int i = 1; i<n; i++){
            maxtoLeft[i] = Math.max(maxtoLeft[i-1], height[i]);
        }
        
        maxtoRight[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            maxtoRight[i] = Math.max(maxtoRight[i+1], height[i]);
        }
        
        int minimumHeight[] = new int[n];
        int minimumWaterHeight[] = new int[n];
        int totalWater = 0;
        for(int i = 0; i<n; i++){
            minimumHeight[i] = Math.min(maxtoLeft[i], maxtoRight[i]);
            minimumWaterHeight[i] = minimumHeight[i] - height[i];
            
            if(minimumWaterHeight[i] > 0)totalWater += minimumWaterHeight[i];
        }
        
        
        return totalWater;
        
        
        
    }
}