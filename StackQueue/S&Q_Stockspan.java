class StockSpanner {
    Stack<int[]> st =new Stack<>();
    
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int res =1;
        while(!st.isEmpty() && st.peek()[0] <= price)
        {
            res += st.pop()[1];
    }
        st.push(new int[]{price,res});
        return res;
    }
}