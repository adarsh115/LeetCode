class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;
        int sellPrice = prices[n-1];
        
        for(int i = n-2; i>=0; i--){
            max = Math.max(max, (sellPrice - prices[i]));
            sellPrice = Math.max(sellPrice, prices[i]);
        }
        
        return max;
    }
}