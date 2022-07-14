class Solution {
    String longest;
    int len;

    public void solve(String s, int left, int right, int n) {
        while (left >= 0 && right < n) {
            int currentLen = right - left + 1;

            if (s.charAt(left) != s.charAt(right))return;
            
            if (currentLen > len) {
                longest = s.substring(left, right + 1);
                len = currentLen;
            }

            left--;
            right++;
        }
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        this.longest = "";
        this.len = 0;

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;

            solve(s, left, right, n);

            right = i + 1;

            solve(s, left, right, n);
        }

        return longest;
    }
}
