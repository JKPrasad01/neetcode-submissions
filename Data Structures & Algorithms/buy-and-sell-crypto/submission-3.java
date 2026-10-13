
class Solution {
    public int maxProfit(int[] prices) {

        int max=0;
        int left=0;

        for(int right=0;right<prices.length;right++){
            

            while(prices[right]<prices[left]){
                left++;
            }

            if(prices[right]>prices[left]){
                
                int diff=prices[right] - prices[left];
                max=Math.max(diff,max);
            }
        }
        return max;
    }
}
