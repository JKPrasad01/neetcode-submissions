class MinStack {
    private List<Integer> res;
    public MinStack() {
        res=new ArrayList<>();
    }
    
    public void push(int val) {
        res.add(val);
    }
    
    public void pop() {
        res.removeLast();
    }
    
    public int top() {
        return res.get(res.size()-1);        
    }
    
    public int getMin() {

        int min=res.get(0);

        for(int i =1 ;i<res.size();i++){

            if(min>res.get(i)){
                min=res.get(i);
            }
        }
        return min;
    }
}
