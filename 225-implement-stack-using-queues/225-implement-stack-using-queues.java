class MyStack {
    Queue<Integer> q;
    
    public MyStack() {
        this.q = new LinkedList<>();
    }
    
    public void push(int x) {
        if(empty()){q.add(x); return;}
        
        q.add(x);
        
        int noaction = q.size()-1;
        while(noaction-- > 0){
            int top = q.remove();
            q.add(top);            
        }
        
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */