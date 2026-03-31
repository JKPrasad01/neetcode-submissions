class Solution {
    public boolean isAnagram(String s, String t) {

        int [] ar1=new int[26];

        for (int i=0;i<s.length();i++){

            int i1 = ar1[s.charAt(i) - 'a'];
            ar1[s.charAt(i)-'a']=i1 +1;
            
        }

        int [] ar2=new int[26];

        for (int i=0;i<t.length();i++){

            int i1 = ar2[t.charAt(i) - 'a'];
            ar2[t.charAt(i)-'a']=i1 +1;
        }
        
        return Arrays.equals(ar1,ar2);
    }
}
