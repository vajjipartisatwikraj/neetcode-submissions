class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;

        int lp = 0;
        int rp = heights.length - 1;

        while(lp < rp){
            int water = (rp - lp) * (Math.min(heights[lp], heights[rp]));

            maxWater = Math.max(maxWater, water);

            if(heights[lp] < heights[rp]){
                lp++;
            }else{
                rp--;
            }
        }

        return maxWater;
    }
}
