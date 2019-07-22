//Time Complexity:O(n)
//SPace complexity:O(1)
//Approach: We start with no hold cash
//prices[0] is the cash we spend, we calculate cash with (pricesCurrent - holdPrice - fee)
//We also update hold price to previous max cash - current price, it will update only if we seell stock and the profit we will earn
//when we buy another stock - cashInHand

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int hold = -prices[0];
        int cash =0;
        
        for(int i=0;i<prices.length;i++)
        {
            cash = Math.max(cash,hold+prices[i]-fee);
          hold =  Math.max(hold,cash-prices[i]);
        }
        return cash;
    }
}
