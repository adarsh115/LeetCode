class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;


        int sell = prices[n-1];
        int maxProfit = 0;
        for(int i = n-1; i>=0; i--){
        
            int profit = Math.max(0, sell - prices[i]);
            sell = Math.max(sell, prices[i]);
            
            
            maxProfit = Math.max(profit, maxProfit);
        }
        

        
        return maxProfit;
    }
}