class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        
        int n = str1.length();
        int m = str2.length();
        
        int dp[][] = new int[n+1][m+1];
        
        for(int i = 0; i<n+1; i++)dp[i][0] = 0;
        for(int i = 0; i<m+1; i++)dp[0][i] = 0;
        
        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        
        int i = n, j = m;
        String reverselcs = "";
        while((i >0) && (j > 0))
        {
            if(str1.charAt(i-1) == str2.charAt(j-1))
            {
                reverselcs = reverselcs + (str1.charAt(i-1) + "");
                i--; j--;
            }
            else
            {
                if(dp[i][j-1] >= dp[i][j])
                    j--;
                else
                    i--;
            }
        }
    
        String lcs = "";
        for(int k = reverselcs.length()-1; k>=0; k--){
            lcs = lcs + (reverselcs.charAt(k)+"");
        }
        
        String ans = "";
        i =0 ;
        j = 0;
        
        for (char c : lcs.toCharArray()) {
            while (str1.charAt(i) != c)
                ans += (str1.charAt(i++)+"");
            while (str2.charAt(j) != c)
                ans += (str2.charAt(j++)+"");
        
            ans += c; i++; j++;
        }
        return ans + str1.substring(i) + str2.substring(j);
        
        
        // System.out.print(dp[n][m]);
        // return "a";
    }
}