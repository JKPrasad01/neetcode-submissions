class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res=new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i=0;i<strs.length;i++){

            if(visited[i]){
                continue;
            }

            List<String> group =new ArrayList<>();

            String s= strs[i];

            group.add(s);
            visited[i]=true;

            for(int j=i+1;j<strs.length;j++){

                if(!visited[j] && isAnagram(s,strs[j])){
                    group.add(strs[j]);
                    visited[j]=true;
                }
            }
            res.add(group);
        }
        return res;
    }


    private boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        
        int[] ar=new int[26];
        
        for (int i=0;i<s.length();i++){
            ar[s.charAt(i)-'a']++;
            ar[t.charAt(i)-'a']--;
        }
        
        for (int v: ar){
            if(v!=0)return false;
        }
        return true;
    }
}
