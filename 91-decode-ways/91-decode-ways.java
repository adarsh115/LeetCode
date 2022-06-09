class Solution {
    int memo[];
    public int solve(String s, int index){
        if (index == s.length()) {
            return 1;
        }
        if (s.charAt(index) == '0') {
            return 0;
        }
        if (memo[index] != -1) {
            return memo[index];
        }
        int way1 = solve(s, index + 1);
        int way2 = 0;
        if (index < s.length() - 1 && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
            way2 = solve(s, index + 2);
        }
        memo[index] = way1 + way2;
        return memo[index];
    }
    public int numDecodings(String s) {
        this.memo = new int[s.length()+1];
        Arrays.fill(memo, -1);
        return solve(s, 0);
    }
}