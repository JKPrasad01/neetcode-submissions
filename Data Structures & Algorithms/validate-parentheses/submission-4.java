class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<>();

        int i=0;

        while(i<s.length()){

            char c=s.charAt(i);

            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{

                if(c ==')'){
                    if(stack.isEmpty() || stack.pop()!='('){
                        return false;
                    }
                }

                if(c=='}'){
                    if(stack.isEmpty() || stack.pop()!='{'){
                        return false;
                    }
                }

                if(c==']'){
                    if(stack.isEmpty() || stack.pop()!='['){
                        return false;
                    }
                }
            }
            i++;
        }
        return stack.isEmpty();
    }
}
