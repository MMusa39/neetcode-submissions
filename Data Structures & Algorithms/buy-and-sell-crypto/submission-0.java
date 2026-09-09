class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrev = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            lowestPrev = Math.min(lowestPrev, prices[i-1]);
            maxProfit = Math.max(maxProfit, prices[i] - lowestPrev);
        }
        return maxProfit;
    }
}
