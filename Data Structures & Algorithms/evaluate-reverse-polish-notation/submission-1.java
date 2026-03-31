class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack=new Stack<>();

        for(String token: tokens){


            if(isOperator(token)){

                int a=stack.pop();
                int b=stack.pop();

                int result =0;
                switch (token){

                    case "+" :
                        result=b+a;
                        break;
                    case "-":
                        result=b-a;
                        break;
                    case "*":
                        result=b*a;
                        break;
                    case "/":
                        result=b/a;
                        break;
                }
                stack.push(result);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("*") || token.equals("-") || token.equals("/");
    }
}
