class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){

            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length-1;j++){

                if(j>i+1 && nums[j]==nums[j-1])continue;
                for(int k=j+1;k<nums.length;k++){
                    
                    if(k>j+1 && nums[k]==nums[k-1])continue;
                    List<Integer> al=new ArrayList<>();    
                    int sum=nums[i]+nums[j]+nums[k];

                    if(sum==0){
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);

                        res.add(al);
                    }


                }
            }
        
        }
        return res;
    }
}
