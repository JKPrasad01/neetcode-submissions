class Solution {
     public boolean isPalindrome(String s) {

        String t="";


        for(int i = 0; i< s.length(); i++){

            char c= s.charAt(i);

            if((c>='a' && c<='z' )|| (c>='0' && c<='9' ) ){
                t =t+c;
            }
            else if (c>='A' && c<='Z'){
                t=t+(char)(c+32);
            }
            
        }
        
        int i=0;
        int j=t.length()-1;
        
        while (i<=j){
            
            if(t.charAt(i)!=t.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
