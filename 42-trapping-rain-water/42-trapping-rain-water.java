class Solution {
    public int trap(int[] height) {
        
        int len = height.length;
        
        int mxl[] = new int[len];
        mxl[0] = height[0];
        
        for(int i = 1; i< len; i++){
            mxl[i] = Math.max(mxl[i-1], height[i]);
        }
        
        int mxr[] = new int[len];
        mxr[len-1] = height[len-1];
        for(int i = len-2; i>=0; i--){
            mxr[i] = Math.max(mxr[i+1], height[i]);
        }
        
        int water[]= new int[len];
        
        for(int i = 0; i<len; i++){
            water[i] = Math.min(mxr[i], mxl[i]) - height[i];
        }
        
        int sum = 0;
        for(int level : water){
            if(level >0)sum+=level;
        }
        
        return sum;
    }
}