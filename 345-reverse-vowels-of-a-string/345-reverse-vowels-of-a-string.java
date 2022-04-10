class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length()<=1)return s;
        
        char c[] = s.toCharArray();
        
        String vowels = "aeiouAEIOU";
        
        int start = 0;
        int end = s.length() - 1;
        
        while(start < end){
            while(start < end && !vowels.contains(c[start]+""))start++;
            while(start < end && !vowels.contains(c[end]+""))end--;
            
//             while(start<end && !vowels.contains(chars[start]+"")){
//             start++;
//             }
        
//             while(start<end && !vowels.contains(chars[end]+"")){
//                 end--;
//             }
            
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        
        s = "";
        for(char ch: c){
            s = s + (ch+"");
        }
        
        return s;
    }
}

