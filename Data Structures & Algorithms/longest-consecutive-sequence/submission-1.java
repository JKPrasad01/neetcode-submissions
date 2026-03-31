class Solution {
   public int longestConsecutive(int[] nums) {

    if(nums.length==0)return 0;

        Arrays.sort(nums);
        int maxCount=0;
        int count=0;
        for (int i=0;i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1])continue;
            if(nums[i]+1==nums[i+1]){
                count++;
            }
            else{
                if(maxCount<count){
                maxCount=count;
                }
                count=0;
            }
        }
        if(maxCount<count){
            maxCount=count;
        }
        return maxCount+1;
    }
}
