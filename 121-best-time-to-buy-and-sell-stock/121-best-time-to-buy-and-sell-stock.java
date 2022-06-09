class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int greatestRight[] = prices.clone();
        
        int max = Integer.MIN_VALUE;
        for(int i = n-1; i>=0; i--){
            max = Math.max(max, prices[i]);
            greatestRight[i] = Math.max(max, greatestRight[i]);
        }
        
        System.out.print(Arrays.toString(greatestRight));
        int maxProfit = 0;
        for(int i = 0; i<n; i++){
            int profit = -prices[i] + greatestRight[i];
            
            maxProfit = Math.max(maxProfit, profit);
        }
        
        return maxProfit;
    }
}