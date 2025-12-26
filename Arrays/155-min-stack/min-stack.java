class MinStack {
    //solution 2 check comments
    Stack<Long> stack ;
    long min ;
    public MinStack() {
       stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(0L);
            min = val;
        }
        else{
            stack.push(val-min);
            if(min>val){
                min =val;
            }
            
        }
            
        
        
    }
    
    public void pop() {

        long element =stack.pop();
        if (element < 0){
           min=min-element;
        }
        
    }
    
    public int top() {

        long top = stack.peek();
        if(top>0){
            return (int) (top+min) ;
        }else{
            return (int) min;
        }
        
        
    }
    
    public int getMin() {
       return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();

***solution 1
   Stack<Integer> stack ;
   Stack<Integer> minStack;
    public MinStack() {
       stack = new Stack<>();
       minStack=new Stack<>();
    }
    
    public void push(int val) {

        stack.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val){
            minStack.push(val);
        }
        
    }
    
    public void pop() {

        int element =stack.pop();

        if(element==minStack.peek()){
            minStack.pop();
        }
        
    }
    
    public int top() {

        int top = stack.peek();
        return top ;
        
    }
    
    public int getMin() {
       return minStack.peek();
    }
 */