class pair{
    int price;
    int span;
    pair(int p, int s){
        this.price = p;
        this.span = s;
    }
}
class StockSpanner {
    Stack<pair> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        
        while(st.size() > 0 && st.peek().price <= price){
            span += st.pop().span;
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