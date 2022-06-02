class Solution {
    public int climbStairs(int n) {
        if(n == 1)return 1;
        int prev = 1;
        int prev2 = 2;
        for(int i = 3; i<=n; i++){
            int current = prev + prev2;
            
            prev = prev2;
            prev2 = current;
        }
        
        return prev2;
    }
}