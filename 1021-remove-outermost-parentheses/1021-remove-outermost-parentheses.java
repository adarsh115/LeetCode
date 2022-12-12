class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char bracket = s.charAt(i);
            
            if(bracket == '(' && count++ > 0){
                sb.append('(');
            }
            if(bracket == ')' && count-- > 1){
                sb.append(')');   
            }
            
        }
        
        return sb.toString();
    }
}