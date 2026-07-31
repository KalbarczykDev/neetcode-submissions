class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length <= 1) return 0;

        int sell = 1;
        int buy = 0;
        int maxProfit = 0;
        while(sell < prices.length){
            int profit = prices[sell] - prices[buy];
            maxProfit = Math.max(profit,maxProfit);

            if(prices[sell] < prices[buy]){
                buy = sell;
            }
            sell++;
        }

        if(maxProfit < 0){
            maxProfit = 0;
        }
        return maxProfit;
    }
}
