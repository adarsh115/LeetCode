class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1)return true;
        
        String str = "";
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str += c;
            }
        }
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
                
      
        
        while(start <= end){
            char charStart = str.charAt(start);
            char charEnd = str.charAt(end);
            
            if(charStart != charEnd){
                return false; 
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}