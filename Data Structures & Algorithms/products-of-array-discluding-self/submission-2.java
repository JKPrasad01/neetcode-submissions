class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<ans.length;i++){
            int current = nums[i];
            int mul = 1;
            for(int j=0;j<ans.length;j++){
                if(j != i){
                    mul *= nums[j];
                }
            }
            ans[i] = mul;
        }
        return ans;
    }
}  
