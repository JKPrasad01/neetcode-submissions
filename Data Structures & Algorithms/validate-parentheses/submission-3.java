class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        int i=0;
        while(i<s.length()){
            char cur=s.charAt(i);

            if(cur=='[' || cur=='{' || cur=='('){
            st.push(cur);
            }
            else{
                if(cur==')'){
                   if(st.isEmpty() || st.pop()!='('){
                    return false;
                   }
                }
                if(cur==']'){
                   if(st.isEmpty() || st.pop()!='['){
                    return false;
                   }
                }
                if(cur=='}'){
                   if(st.isEmpty() || st.pop()!='{'){
                    return false;
                   }
                }
            }
            i++;
        } 
        return st.isEmpty();

    }
}

