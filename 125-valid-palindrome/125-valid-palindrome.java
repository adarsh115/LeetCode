class Solution {
     public boolean isPalindrome(String s) {
            char[] c = s.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--])) 
                return false;
        }
        return true;
     }
//     public boolean isPalindrome(String s) {
//         if(s.length() <= 1)return true;
//         // s = s.toLoweCase();
//         String str = "";
        
//         for(char c: s.toLowerCase().toCharArray()){
//             if(Character.isLetterOrDigit(c))
//                 str += (c + "");
//         }
//         return checkPalindrome(str);
//     }
    
//     public boolean checkPalindrome(String s){
//         System.out.print(s);
//         if(s.length()<=1)return true;
//         int b = 0;
//         int e = s.length()-1;
        
//         while(b <= e){
//             if(s.charAt(b) != s.charAt(e))return false;
//             b++;
//             e--;
//         }
        
//         return true;
//     }
}