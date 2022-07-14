
class Solution {
    int count;
 

    public void solve(String s, int left, int right, int n) {
        while (left >= 0 && right < n) {
            int currentLen = right - left + 1;

            if (s.charAt(left) != s.charAt(right))return;
            
            count++;

            left--;
            right++;
        }
    }
    public int countSubstrings(String s) {
        int n = s.length();
        this.count = 0;

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;

            solve(s, left, right, n);

            right = i + 1;

            solve(s, left, right, n);
        }

        return count;
    }

}
