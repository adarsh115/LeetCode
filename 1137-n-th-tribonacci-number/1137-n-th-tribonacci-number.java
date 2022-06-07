class Solution {
    
    public int solve(int n){
        if(n == 0)return 0;
        if(n == 1 || n == 2)return 1;
        
        int first = 0;
        int second = 1;
        int third = 1;
        
        for(int i = 3; i<n+1; i++){
            int fourth = third + second + first;
            
            first = second;
            second = third;
            third = fourth;
        }
        
        return third;
    }
    public int tribonacci(int n) {
        // this.dp = new int[38];
        // Arrays.fill(dp, -1);
        return solve(n);
    }
}