class Solution {
    public boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;

        while(i<j){

            char c1=s.charAt(i);
            char c2=s.charAt(j);

            if(c1!=c2){
                return checkPalindrome(s,i,j-1) || checkPalindrome(s,i+1,j);
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean checkPalindrome(String str,int s,int e){

        while(s<e){

            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}