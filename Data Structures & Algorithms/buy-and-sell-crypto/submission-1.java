class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;

        int[] maxToRight = new int[prices.length];
        maxToRight[maxToRight.length - 1] = 0;
        for(int i = maxToRight.length - 2; i >= 0; i--) {
            maxToRight[i] = Math.max(prices[i + 1], maxToRight[i + 1]);
        }

        int result = 0;
        for(int i = 0; i < prices.length; i++) {
            result = Math.max(result, maxToRight[i] - prices[i]);
        }
        return result;
    }
}
