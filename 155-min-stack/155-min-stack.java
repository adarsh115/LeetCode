class MinStack {
    Stack <Pair<Integer, Integer>> s;
    public MinStack() {
        s = new Stack();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            Pair p = new Pair<>(val,val);
            s.push(p);
            return;
        }
        Pair p = new Pair<>(val,Math.min(val,getMin()));
        s.push(p);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().getKey();
    }
    
    public int getMin() {
        return s.peek().getValue();
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