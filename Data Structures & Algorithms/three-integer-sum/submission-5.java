


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {




    List<List<Integer>> res = new ArrayList<>();
        if(nums.length==0)return res;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length;j++){
                    
                   
                for(int k = j+1 ; k<nums.length;k++){
                    
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        if(!res.contains(List.of(nums[i],nums[j],nums[k]))){
                            res.add(List.of(nums[i],nums[j],nums[k]));                    
                        }
                    }            
                }
            }
        }
    return res;
    }
}