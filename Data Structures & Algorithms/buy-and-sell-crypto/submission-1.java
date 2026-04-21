class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            int currPrice = prices[i];

            for(int j=i; j<prices.length; j++){
                
                if(prices[j] > currPrice){
                    int profit = prices[j] - currPrice;
                    maxProfit = Math.max(profit, maxProfit);
                }
            }
        }

        return maxProfit;
    }

}
