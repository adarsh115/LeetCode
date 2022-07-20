class pair{
    int first;
    int second;
    pair(int f, int s){
        this.first = f;
        this.second = s;
    }
}
class StockSpanner {
    Stack<pair> st;
    public StockSpanner() {
        this.st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        
        while(st.size() > 0 && st.peek().first <= price){
            span += st.pop().second;
        }
        
        st.push(new pair(price, span));
        
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */