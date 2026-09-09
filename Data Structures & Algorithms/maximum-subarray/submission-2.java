class Solution {
    public int maxSubArray(int[] nums) {
        // Store the max sum of a subarray whose last element is at index i
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = dp[0];
        for(int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
