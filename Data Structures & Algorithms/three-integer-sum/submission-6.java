
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0)return res;
    
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){


            if(i>0 && nums[i]==nums[i-1])continue;

            int target = nums[i];        
            
            int a = i+1;
            int b=nums.length-1;

            while(a<b){

                int sum = nums[i]+nums[a]+nums[b];
                if(sum==0){
                         res.add(List.of(nums[i],nums[a],nums[b]));

                        a++;
                        b--;
                    while(a<b && nums[a]==nums[a-1])a++;
                    while(a<b && nums[b] == nums[b+1])b--;

                }
                else if(sum < 0)a++;
                else b--;
                        
            }
        }
    return res;
    }
}