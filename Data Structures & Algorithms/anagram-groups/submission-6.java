class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();

        for (String s: strs){

            String f = hashing(s);

            if(m.containsKey(f)){
                m.get(f).add(s);
            }
            else{
                List<String> group = new ArrayList<>();
                group.add(s);
                m.put(f,group);
            }
        }
        return new ArrayList<>(m.values());
    }

    private String hashing(String s) {
        int[] ar=new int[26];

        StringBuilder stringBuilder=new StringBuilder();

        for(int i=0;i<s.length();i++){

            int index = s.charAt(i)-'a';
            ar[index]++;
        }

        for (int a:ar){
            stringBuilder.append("#");
            stringBuilder.append(a);
        }

        return stringBuilder.toString();
    }
}
