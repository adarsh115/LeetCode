class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxSp = prices[n-1];
        
        int maxP = 0;
        
        for(int i=n-2; i>=0; i--){
            int profit = maxSp-prices[i];
            
            maxP = Math.max(maxP, profit);
            
            maxSp = Math.max(maxSp, prices[i]);
        }
        
        return maxP;
    }
}