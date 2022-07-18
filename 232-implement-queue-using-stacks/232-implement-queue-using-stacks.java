class MyQueue {
    Stack<Integer> i;
    Stack<Integer> o;
    public MyQueue() {
        this.i = new Stack<>();
        this.o = new Stack<>();
    }
    
    public void push(int x) {
        i.add(x);
    }
    
    public int pop() {
        if(o.size() > 0)return o.pop();
        
        while(i.size() > 0){
            o.push(i.pop());
        }
        
        return o.pop();
    }
    
    public int peek() {
        if(o.size() > 0)return o.peek();
        
        while(i.size() > 0){
            o.push(i.pop());
        }
        
        return o.peek();
    }
    
    public boolean empty() {
        return (i.size() == 0 && o.size() == 0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */