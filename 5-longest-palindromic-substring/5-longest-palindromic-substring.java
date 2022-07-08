class Solution {
    String longest;
    int len;
    
    public void solve(String s, int start, int end, int n){
        
        while(start >= 0 && end < n && s.charAt(start) == s.charAt(end)){            
            int currentlen = end-start+1;
            
            if(currentlen > len){
                len = currentlen;
                longest = s.substring(start, end+1);
            }
            start--;
            end++;
        }
        return;
    }
    public String longestPalindrome(String s) {
        this.longest = "";
        this.len = 0;
        
        int n = s.length();

         for(int i=0; i<n; i++){
             
                solve(s, i, i, n);

                solve(s, i, i+1, n);
         }

        
        return longest;
    }
}