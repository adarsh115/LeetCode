class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int greatestRight = 0;
        
        int max = Integer.MIN_VALUE;
        int maxProfit = 0;
        for(int i = n-1; i>=0; i--){
            max = Math.max(max, prices[i]);
            greatestRight = Math.max(max, greatestRight);
            
            int profit = -prices[i] + greatestRight;
            
            maxProfit = Math.max(maxProfit, profit);
        }
        
        // System.out.print(Arrays.toString(greatestRight));
//         int maxProfit = 0;
//         for(int i = 0; i<n; i++){
//             int profit = -prices[i] + greatestRight[i];
            
//             maxProfit = Math.max(maxProfit, profit);
//         }
        
        return maxProfit;
    }
}