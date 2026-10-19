class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int start=1;
        int end=0;

        for(int p:piles){
            end=Math.max(p,end);
        }

        int ans=0;

        while(start<=end){
            int mid = start + (end-start)/2;

            long hours=0;
            for(int p : piles){
                hours += (p + (long) mid -1 ) /mid;
            }

            if(hours<=h){
                ans = mid;
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
