class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();

        for (String s: strs){

            String f = sort(s);

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

    private static String sort(String s) {
        char[] chars =s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
