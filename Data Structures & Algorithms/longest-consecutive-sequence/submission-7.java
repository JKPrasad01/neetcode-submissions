class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)return 0;
        Set<Integer> set = new HashSet<>();

        for(int n:nums){
            set.add(n);   
        }

        int max=0;

       for(int n : set){

            if(!set.contains(n-1)){

                int cur = n;
                int count = 1;
            
                while(set.contains(cur+1)){
                    cur++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
