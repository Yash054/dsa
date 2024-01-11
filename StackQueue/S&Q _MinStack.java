class MinStack {
        Stack<Long> st =new Stack<Long>();//ll
        Long mi;
    public MinStack() {
        mi = Long.MAX_VALUE;
            }
    
    public void push(int value) {
        Long val = Long.valueOf(value);//convert
        if(st.isEmpty()) {
            mi = val;
            st.push(val);
        }
        else{
            if(val < mi){
               st.push(2*val - mi);
                mi= val;
                

            }
            else{
                st.push(val);
            }
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;

        Long val = st.pop();
        if(val < mi){
            mi =2*mi-val;
        }
       // return val.intValue();
    }
    
    public int top() {
        Long val =st.peek();
        if(val<mi){
            return mi.intValue();// return
        }
        return val.intValue();
    }
    
    public int getMin() {
        return mi.intValue();
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