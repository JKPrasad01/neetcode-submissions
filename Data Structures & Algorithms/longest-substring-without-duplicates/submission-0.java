class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set=new HashSet<>();

        int i=0;
        int j=0;
        int res=0;
        while(j<s.length()){
            char ch=s.charAt(j);

            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }

            int diff=j-i+1;
            res=Math.max(res,diff);
            set.add(ch);
            j++;
        }
        return res;
    }
}
