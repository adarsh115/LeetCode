class Solution {
    public int evalRPN(String[] tokens) {
       
        Stack<Integer> st = new Stack();
        
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int e2 = st.peek();
                st.pop();
                int e1 = st.peek();
                st.pop();
                
                
                int res = -300;
                switch(s){
                    case "+" : res = e1 + e2;
                        break;
                    case "-" : res = e1 - e2;
                        break;
                    case "*" : res = e1 * e2;
                        break;
                    case "/" : res = e1 / e2;
                        break;
                }
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        
        return st.peek();
        
    }
}