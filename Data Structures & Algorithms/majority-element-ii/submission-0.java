class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int avg=nums.length/3;

        Map<Integer,Integer> map=new HashMap<>();

        List<Integer> al=new ArrayList<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        
            if(map.get(num)>avg && !al.contains(num)){
                al.add(num);
            }
        }
        return al;
    }
}