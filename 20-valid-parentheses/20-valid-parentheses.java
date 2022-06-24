class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                s.push(c);
                continue;
            }
            
            if(s.isEmpty()){
                return false;
            }
            else{
                char top = s.pop();
                switch(c){
                    case ')': if(top == '[' || top == '{')return false;
                            break;
                    case '}': if(top == '(' || top == '[')return false;
                            break;
                    case ']': if(top == '(' || top == '{')return false;
                            break;
                        
                }
            }
            
        }
                    if(s.size() > 0)return false;
            return true;
    }
}