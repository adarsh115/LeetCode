class Solution {
    String longest;
    int len;
    
    public void solve(int left, int right, String s, int n){
        while(left >=0 && right < n && s.charAt(left) == s.charAt(right)){
            if(right - left + 1 > len){
                len = right-left +1;
                longest = s.substring(left, right+1);
            }
            left--;
            right++;
        }
    }
    public String longestPalindrome(String s) {
        this.longest = "";
        this.len = 0;
        
        int n = s.length();
        
        for(int i = 0; i<n; i++){
            int left = i;
            int right = i;
            
            solve(left, right, s, n);
            
            left= i;
            right = i+1;
            solve(left, right, s, n);
        }
        
        return longest;
    }
}