class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())return false;
     int[] ch = new int[26];

     for(int i=0;i<s.length();i++){

        char ch1 = s.charAt(i);
        char ch2 = t.charAt(i);

        ch[ch1-'a']+=1;
        ch[ch2-'a']-=1;
     }

     for(int n : ch){
        if(n!=0)return false;
     }
     return true;
    }
}
