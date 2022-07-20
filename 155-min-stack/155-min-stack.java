class pair{
    int data;
    int min;
    
    pair(int v, int m){
        this.data = v;
        this.min = m;
    }
}
class MinStack {

    Stack<pair> st;
    public MinStack() {
        this.st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new pair(val, val));
            return;
        }
        
        st.push(new pair(val, Math.min(val, st.peek().min)));
    }
    
    public void pop() {
        if(st.isEmpty())return;
        
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty())return -1;
        
        return st.peek().data;
    }
    
    public int getMin() {
        if(st.isEmpty())return -1;
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */