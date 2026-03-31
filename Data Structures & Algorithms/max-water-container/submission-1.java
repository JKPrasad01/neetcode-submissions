class Solution {
    public int maxArea(int[] heights) {
        

        int max=0;

        int i=0;
        int j=heights.length-1;

        while(i<j){

            int min = Math.min(heights[i],heights[j]);
            int sum = min * (j-i);

            if(sum>max)max=sum;

            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
