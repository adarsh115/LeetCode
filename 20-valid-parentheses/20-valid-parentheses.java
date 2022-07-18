class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
                continue;
            }
            else if(stack.size() == 0)return false;
            else{
                char top = stack.pop();
                switch(x){
                    case ')': if(top == '[' || top == '{')return false;
                        break;
                    case '}': if(top == '[' || top == '(')return false;
                        break;
                    case ']': if(top == '(' || top == '{')return false;
                        break;
                }
                
            }
        }
        
        
        
        if(!stack.isEmpty())return false;
        
        return true;
    }
}