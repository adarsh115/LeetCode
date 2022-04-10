class Solution {
    public String reverse(String s){
        int n = s.length();
        String st = "";
        
        for(int i = n-1; i>=0; i--){
            st += (s.charAt(i) + "");
        }
        
        return st;
    }
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        
        for(int i = 0; i<str.length; i++){
            str[i] = reverse(str[i]);
        }
        
//         s = "";
//         for(String x: str){
//             s += (x + " ");
//         }
        
        return String.join(" ", str);
    }
}