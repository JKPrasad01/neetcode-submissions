class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>> res = new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();
        
        List<String> al = new ArrayList<>();
        for(int i=0;i< strs.length ;i++){

           String key = generateKey(strs[i]);

        map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);        }

        return new ArrayList<>(map.values());

    }


    private String generateKey(String s){


        int[] ar = new int[26];

        for(int i = 0 ;i<s.length();i++){

            ar[s.charAt(i)-'a']+=1;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<ar.length;i++){
            sb=sb.append(ar[i]);
            sb=sb.append("#");
        }

        return sb.toString();
        

    }
}