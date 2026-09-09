class Solution {
    public int maxProfit(int[] prices) {
        int lowestSoFar = prices[0];
        int result = 0;
        for(int i = 1; i < prices.length; i++) {
            result = Math.max(result, prices[i] - lowestSoFar);
            lowestSoFar = Math.min(lowestSoFar, prices[i]);
        }
        return result;
    }
}
