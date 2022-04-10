class Solution {
    public boolean isPalindrome(String st, int s, int e){
        while(s < e){
            if(st.charAt(s) != st.charAt(e))return false;
            s++;
            e--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        
        int count  = 0;
        int start = 0;
        int end = s.length()-1;
        
        while(start <= end){
            if( s.charAt(start) == s.charAt(end) ){
                start++;
                end--;
            }
            else{
                return isPalindrome(s, start+1, end) || isPalindrome(s, start, end-1);
            }
        }
        return true;
    }
}